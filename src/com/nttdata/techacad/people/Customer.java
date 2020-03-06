package com.nttdata.techacad.people;

public class Customer {

    public int custID;
    private String custName;
    protected Address address;
    Contact contact;

    public static int custCount = 0;

    public final int MAXPHONES = 3;

    public Customer(int custID, String custName, Address address, Contact contact) {
        this.custID = custID;
        this.custName = custName;
        this.address = address;
        this.contact = contact;
    }

    public void print(){
        System.out.println("Id: " + custID + ", Name: " + custName + ", Address: " + address.getAddress() + ", Contact: " + contact.getContact());
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public static class Address{
        private String address;

        public Address(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Contact{
        protected String contact;

        public Contact(String contact) {
            this.contact = contact;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }
    }

}
