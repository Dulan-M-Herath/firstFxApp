package table_model;

public class Customer_TM {
    private String CID;
    private String name;
    private String Address;
    private String contact;

    public Customer_TM() {
    }

    public Customer_TM(String CID, String name, String address, String contact) {
        this.CID = CID;
        this.name = name;
        Address = address;
        this.contact = contact;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
