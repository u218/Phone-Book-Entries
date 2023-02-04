package Practical_17;
 class User {
    public static void main(String[] args) {
        System.out.println("4 diffrenet entries are creted below\n");
        PhoneBookEntry EntryNo1=new PhoneBookEntry("Waleed","075505","weedi@gmail.com","Ol8");
        PhoneBookEntry EntryNo2=new PhoneBookEntry("Hassan","073030","weedi@icloud.com","OL7");
        PhoneBookEntry EntryNo3=new PhoneBookEntry("Gujjar","073434","weedi@hotmailgmail.com","Ol6");
        PhoneBookEntry EntryNo4=new PhoneBookEntry("Nooney","073332","weedi@yahoo.com","Ol5");


        System.out.println("PhoneBook is created\n");

        PhoneBook Book=new PhoneBook();
        Book.AddingEntry(EntryNo1);
        Book.AddingEntry(EntryNo2);
        Book.AddingEntry(EntryNo3);
        Book.AddingEntry(EntryNo4);


        System.out.println("Phone Book Entries:");
        Book.printAllEntries();

        System.out.println("\nSearching for entry 'Waleed' returns => "+Book.searchEntry(new PhoneBookEntry("Waleed","","","")));

        System.out.println("\nDeleting entry \"Waleed\" from phone book\n");
        Book.RemoveEntry(EntryNo1);

        System.out.println("Phone Book Entries:");
        Book.printAllEntries();

    }
}
