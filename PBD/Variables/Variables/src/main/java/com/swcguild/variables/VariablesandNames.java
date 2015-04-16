package com.swcguild.variables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class VariablesandNames {
    public static void main(String[] args) {
        
        //sets these variables as integers
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        //sets these variables as doubles
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
        
        cars = 100; //variable cars is equal to 100
        space_in_a_car = 4.0; //space in the car is defined as 4.0
        drivers = 30;// there are 30 drivers
        passengers = 90; //with 90 total passengers
        cars_not_driven = cars - drivers; // equation to find out how many cars werent driven
        cars_driven = drivers; // to understand how many were driven, look at number of drivers
        carpool_capacity = cars_driven * space_in_a_car; //to figure out maximum potential in carpools multiply the space inside of car times cars driven
        average_passengers_per_car = passengers / cars_driven; //simply finding average per car by taking total number of passengers and dividing by number of cars driven
        
        System.out.println("There are " + cars + " cars available." ); //printing out statement with cars being replaced by the number it represents
        System.out.println("There are only " + drivers + " drivers available." ); //statement declaring how many drivers are available by replacing drivers with it's value
        System.out.println("There will be " + cars_not_driven + " empty cars today." ); //to state how many cars not in use, replacing variable with value
        System.out.println("We can transport " + carpool_capacity + " people today." ); //figuring out how many people can be transported in the carpool using the value derived from previous equation
        System.out.println("We have " + passengers + " to carpool today." ); // stating how many passengers were there
        System.out.println("We need to put about " + average_passengers_per_car + " in each car." ); //stating the average number of passengers per car using previously stated equation
    }
   }

