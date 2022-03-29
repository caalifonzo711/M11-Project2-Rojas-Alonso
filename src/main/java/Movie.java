package com.company;
import java.util.ArrayList;



public class Movie {
    private String genre;
    private Director director;

    ArrayList<Actor> actor;
    ArrayList<Crew> crew;

    private double Budget;
    //set both MoneySpent, MoneyEarned, Profit equal to 0
    private double MoneySpent = 0.0;
    private double MoneyEarned = 0.0;
    private double Profit = 0.0;

    public Movie(String genre, Director director, ArrayList<Actor> actor, ArrayList<Crew> crew, double Budget, double Profit){
        this.genre =genre;
        this.director =director;
        this.actor =actor;
        this.crew =crew;
        this.Budget = Budget;
        this.Profit = Profit;

    }public double getRoyalties(){

        this.director.setEarnings(0.1 * this.Profit);
        return this.director.getEarnings();
    }
    public double getProfit() {
        return Profit;
    }
    public void setProfit(double profit) {
        this.Profit = profit;}

    public double getBudget() {
        return Budget;
    }
    public void setBudget(double budget) {
        Budget = budget;
    }
    public double payday(){


        for(int i = 0; i < actor.size(); i++) {
           this.MoneySpent += actor.get(i).getPay();
       }
       for(int i = 0; i < crew.size(); i++){
           this.MoneySpent += crew.get(i).getPay();
       }
        //for loop
        //MoneySpent += getHoursWorked();
        return this.MoneySpent;

        //for each actor/crew get thier pay
        //this.budget-= crew.pay*hours worked
    }/*

    //Getz and Setz

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }







    public ArrayList<Actor> getActor() {
        return Actor;
    }
    public void setActor(ArrayList<Actor> actor) {
        Actor = actor;
    }

    public ArrayList<Crew> getCrew() {
        return Crew;
    }
    public void setCrew(ArrayList<Crew> crew) {
        Crew = crew;
    }







    public double getMoneySpent() {
        return MoneySpent;
    }
    public void setMoneySpent(double moneySpent) {
        this.MoneySpent = moneySpent;
    }


    public double getMoneyEarned() {
        return MoneyEarned;
    }
    public void setMoneyEarned(double moneyEarned) {
        this.MoneyEarned = moneyEarned;
    }



    }
*/
}









//you won't be able to use the movie unles you create all the other things too
        //you need a getgenre, getdirector, getAlist, getClist
 // call movie with app
    //   }
    //Genre
    //Director
    // List of Actors (Don't use array, use LIST)
    // List of Crew
    // Budget
    // Money Spent (set equal to 0)
    // Money Earned (set equal to 0)
    // Profit (set equal to 0) money earned minus money spent


    //make a method that can calculate profit
    // make a payday method that pays all actors and crews and adds to total $ spent

    //main method is the app class

