/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.ifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TwoMoreQuestions {

    public static void main(String[] args) {
        String question1 = "", question2 = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("TWO MORE QUESTIONS! yayyy");
        System.out.println("Think of something and I will try to guess it.\n");
        System.out.println("Question 1: Does it stay 'inside', 'outside' or 'both'?");
        question1 = sc.nextLine();
        System.out.println("Question 2: Is it 'alive' or 'not alive'?");
        question2 = sc.nextLine();

        if (question1.equals("inside") && question2.equals("alive")) {
            System.out.println("Then what else could you be thinking of besides a houseplant!");
        }
        if (question1.equals("outside") && question2.equals("alive")) {
            System.out.println("Then what else could you be thinking of besides a bison!");
        }
        if (question1.equals("both") && question2.equals("alive")) {
            System.out.println("Then what else could you be thinking of besides a dog!");
        }
        if (question1.equals("inside") && question2.equals("not alive")) {
            System.out.println("Then what else could you be thinking of besides a shower curtain!");
        }
        if (question1.equals("outside") && question2.equals("not alive")) {
            System.out.println("Then what else could you be thinking of besides a billboard!");
        }
        if (question1.equals("both") && question2.equals("not alive")) {
            System.out.println("Then what else could you be thinking of besides a cell phone!");
        }
    }
}
