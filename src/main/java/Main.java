package com.company;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
    Crew crew1 = new Crew("Bill", 100, 2500, "Camera dept");
    Crew crew2 = new Crew("Bob", 101, 2501, "Camera dept");
    Actor actor1 = new Actor("Robert", 2000, 0, "Batman");
    Actor actor2 = new Actor("Zoe", 3000, 0, "Catwoman");
    PA pa1 = new PA("Shhh", 25, 0, 88, "PA dept");
    Director director = new Director("Matt", 0, 0, "Camera dept");



    ArrayList<Actor> actorList = new ArrayList<Actor>();
    actorList.add(actor1);
    actorList.add(actor2);


    ArrayList<Crew> crewList = new ArrayList<Crew>();
    crewList.add(crew1);
    crewList.add(crew2);

Movie movie= new Movie("Action", director, actorList, crewList, 200, 600);

    //how much PA earned
    System.out.println("PA earnings: $" + pa1.getHoursWorked());

    //how much was the budget
    System.out.println("Budget: $" + movie.getBudget());

    //how much movie profited
    System.out.println("Profits: $" + movie.getProfit());

    //how much director made in royalties
    System.out.println("Director's Royalty: $" + movie.getRoyalties());

    System.out.println("Movie Spent: $" + movie.payday());
}}