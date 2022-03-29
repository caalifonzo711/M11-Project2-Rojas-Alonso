package com.company;

public class Crew extends Person {
    protected String department;

    public Crew( String name , double pay , double earnings, String department) {
        super(name, pay, earnings);
        this.department = department;

    }


    public String getDept() { return department; }
    public void setDept(String department) { this.department = department;}

}
