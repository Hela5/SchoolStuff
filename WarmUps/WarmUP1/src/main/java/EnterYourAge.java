
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class EnterYourAge {
    
    public static void main(String[] args) {
        byte age;
       
        Scanner keyboard = new Scanner(System.in);
        
       System.out.println("What is your age?");
       age = keyboard.nextByte();
       
       if (age <= 18) {
           System.out.println("You must be in school");
       } else if (age > 18 && age <= 65) {
           System.out.println("Time to go to work!");
       } else {
           System.out.println("Enjoy retirement!");
       }
    }
    
}
