/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.fileinputandoutput;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HighScore {

    public static void main(String[] args) throws Exception {
        PrintWriter score = new PrintWriter(new FileWriter("HighScore.txt"));
        Scanner sc = new Scanner(System.in);

        System.out.println("You got a high score!");
        String name = "";
        int userScore = 0;
        System.out.println("Please enter your score: ");
        userScore = sc.nextInt();
        System.out.println("Please enter your name: ");
        name = sc.next();
        System.out.println("Data stored into HighScore.txt");
                
        score.println("You got a high score!");
        score.println("Please enter your score: " + userScore);
        score.println("Please enter your name: " + name);
        score.println("Data stored into HighScore.txt");
        score.flush();
        score.close();

    }
}
