
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
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favoriteTeam = "";
                
         do {
              System.out.println("Please enter your favorite team");
              favoriteTeam =  sc.nextLine();
        } while (!favoriteTeam.equals("Browns"));
         
         int userNumber = 0;
         System.out.println("Please enter a number:");
         userNumber = sc.nextInt();
         
         while (userNumber < 10 && userNumber >= 0) {
             System.out.println(--userNumber);
            
         }
        
         System.out.println("Please enter another number:");
         userNumber = sc.nextInt();
         for (int i = userNumber; i >= 0; i--) {
             System.out.println(i);
         }
        
    }
}
