/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.inheritanceexamples;

/**
 *
 * @author apprentice
 */
public class Manager extends Employee {

    public void doWork() {
//        super.doWork(); //calls doWork of employee and then manager too
        System.out.println(name + " Manager: Managing the folks here.");
    }

    public void createObjective() {
        super.createObjective();
        System.out.println("Manager: Manage to the best of my ability!");
    }

    public void hire() {
        System.out.println("Welcome aboard!");
    }

    public void fire() {
        System.out.println("Your services are no longer necessary!");
    }

    public void givePerformanceReview() {
        System.out.println("Well done. Work harder next year, please.");
    }

    public Manager() {
        super("Steve");
        System.out.println("Manager created here.");
    }
    
    public Manager(String name) {
        super(name);
        System.out.println("Manager created here " + name);
    }
}
