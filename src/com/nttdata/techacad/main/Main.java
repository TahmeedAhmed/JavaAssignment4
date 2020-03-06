package com.nttdata.techacad.main;

import com.nttdata.techacad.people.Customer;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Toby", new Customer.Address("124 Road"), new Customer.Contact("some person"));
        c1.print();
        Customer.custCount++;
        System.out.println("Number of customers: " + Customer.custCount + "\n");

        //System.out.println(c1.custID ); // public modifier, so can access
        //System.out.println(c1.custName); // private, so cant access
        //System.out.println(c1.address); // protected, so cant access it
        //System.out.println(c1.contact); // default modifier, not public, so cant access

        Customer c2 = new Customer(2, "Maguire", new Customer.Address("123 Street"), new Customer.Contact("someone else"));
        c2.print();
        c2.custCount++;
        System.out.println("Number of customers: " + Customer.custCount + "\n");

        System.out.println(c2.MAXPHONES);   // Works
        //System.out.println(Customer.MAXPHONES); // Doesn't work. Cant access non-static field from static context
    }

}