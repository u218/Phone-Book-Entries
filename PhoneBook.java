package Practical_17;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 class PhoneBook{

        Map<String, PhoneBookEntry> Details;
//      will store name as key and PhoneBookEntry as value

     // contructor
        PhoneBook() {
            Details=new HashMap<String, PhoneBookEntry>();
        }

        public Map<String, PhoneBookEntry> getDetails()
        {
            return Details;
        }
        public boolean Already_present(PhoneBookEntry Check_Entry) {
            //returns true if key already present
            if (this.getDetails().containsKey(Check_Entry.getFullName())) {
                return true;
            }
                return false;

        }

        public boolean AddingEntry(PhoneBookEntry Add_Entry)
        {
            //if entry is already not added then add it in the map
            if(!this.Already_present(Add_Entry))
            {
                this.getDetails().put(Add_Entry.getFullName(),Add_Entry);
                return true;
            }
            return false;
        }
        public boolean updateEntry(PhoneBookEntry Update_entry)
        {
            //update the already existing entry based on the key
            if(Already_present(Update_entry))
            {
                this.getDetails().replace(Update_entry.getFullName(), Update_entry);
                return true;
            }
            return false;
        }
        public boolean RemoveEntry(PhoneBookEntry Remove_entry)
        {
            //delete the entry from the map
            if(Already_present(Remove_entry))
            {
                this.getDetails().remove(Remove_entry.getFullName());
                return true;
            }
            return false;
        }
        public String searchEntry(PhoneBookEntry entry)//work for both name and phoneBookEntry
        {
//        returns the phone number if entry is added
            if(!Already_present(entry))
                return "";
            else{
                return (this.getDetails().get(entry.getFullName()).getFullName()+"::"+this.getDetails().get(entry.getFullName()).getPhoneNumber());
            }
        }
        public void printAllEntries()
        {
            //displays all the entries of the map
            Set setData=this.getDetails().entrySet();
            int i=0;
            for(i=0;i< setData.size();i++)
            {
                System.out.println(setData.toArray()[i]);

            }
        }
        @Override
        public String toString() {
            return "phoneBook::" +
                    "book::" + Details +
                    ':';
        }
    }

