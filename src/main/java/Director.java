package com.company;



public class Director extends Crew {
    //private double Roy;
    private double RoyPer = 0.01;


    public Director(String name, double pay, double earnings, String department) {
        super(name, pay, earnings, department);
        //this.Roy = Roy;

    }
    public double getEarnings() { return earnings; }
    public void setEarnings(double earnings) { this.earnings = earnings; }
}






