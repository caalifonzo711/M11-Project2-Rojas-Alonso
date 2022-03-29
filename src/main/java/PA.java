package com.company;

public class PA extends Crew {
private double hoursWorked;


public PA(String name, double pay, double earnings, double hoursWorked, String department) {
        super(name, pay, earnings, department);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked * pay;
}
}



    //add a method that allows you to add hours to PA object
    /*public double payday(double payday) {
        double payday = this.pay;
    }
    public void calculateMoneyEarned(int hoursWorked) {
        moneyEarned = getPay() * hoursWorked;
        System.out.println("PA earned " + moneyEarned);/*
    }

}

//kpayday goes through every single staff member, you spend money every time you pay someone
//PRofit comes from money earned
// you can put a random number for money earned
//Money earned budget u supply minus money spent ( every time someone gets paid)

/*public class Checking extends Account {
    public Checking(User user, double balance) {
        super(user, balance);
    }


    public double deposit(double deposit) {
        double newBalance = balance += deposit;
        return newBalance;
    }


    public double withdraw(double withdrawal) {
        double newBalance = balance -= withdrawal;
        return newBalance;
    }
}*/
