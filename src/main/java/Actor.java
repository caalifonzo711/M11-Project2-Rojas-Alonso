package com.company;

public class Actor extends Person {
    protected String Arole;


    public Actor(String name, double pay, double earnings, String Arole) {
       super(name, pay, earnings);
        this.Arole = Arole;
    }

    public String getArole() { return Arole; }
    public void setArole(String Arole) {
        this.Arole = Arole;
    }

}
