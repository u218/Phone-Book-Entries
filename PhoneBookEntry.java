package Practical_17;
class PhoneBookEntry {
    // instance variables to store information about a phone book entry
    private String full_Name;
    private String email;
    private String phone_Number;

    private String address;
    // getters and setters for all instance variables
    public String getFullName()
    {
        return full_Name;
    }

    public void setFullName(String fullName) {
        this.full_Name = fullName;
    }

    public String getPhoneNumber()
    {
        return phone_Number;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phone_Number = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    // constructor to specify values for all instance variables
    public PhoneBookEntry(String fullName, String phoneNumber, String email, String address) {
        this.full_Name = fullName;
        this.phone_Number = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // toString method to return a string representation of the object
    @Override
    public String toString() {
        return   "full_Name:: '" + full_Name + '\'' +
                ", phone_Number:: '" + phone_Number + '\'' +
                ", email:: '" + email + '\'' +
                ", address:: '" + address + '\'';
    }
}

