package com.company;

public abstract class Person {

    //protected means you can't access name outside
    protected String name;
    protected double pay;
    protected double earnings;

    //set values to pay and earnings as well in the constructor


    public Person(String name, double pay, double earnings) {
        this.name = name;
        this.pay = pay;
        this.earnings = earnings;
    }
    //Declare an abstract double for pay and earnings


    public double getPay() { return pay; }
    public void setPay(double pay) { this.pay = pay; }
    //declare setPay()
    public double getEarnings() { return earnings; }
    public void setEarnings(double earnings) { this.earnings = earnings; }
    //declare setEarnings()
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


}

