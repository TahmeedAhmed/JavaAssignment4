package com.nttdata.techacad.people;

public class Employee {
    private int empID;

    public Employee(int empID) {
        this.empID = empID;
    }

    public void print(){
        System.out.println("EmpID: " + empID);
    }
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
