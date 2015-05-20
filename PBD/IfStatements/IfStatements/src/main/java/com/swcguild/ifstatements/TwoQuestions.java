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
public class TwoQuestions {

    public static void main(String[] args) {
        String question1 = "", question2 = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");

        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        question1 = sc.nextLine();

        System.out.println("Question 2) Is it bigger than a breadbox? (yes or no)");
        question2 = sc.nextLine();

        if (question1.equals("animal") && question2.equals("no")) {
            System.out.println("My guess is you were thinking of a squirrel.");
        }
        if (question1.equals("vegetable") && question2.equals("no")) {
            System.out.println("My guess is you were thinking of a carrot.");
        }
        if (question1.equals("mineral") && question2.equals("no")) {
            System.out.println("My guess is you were thinking of a paper clip.");
        }
        if (question1.equals("animal") && question2.equals("yes")) {
            System.out.println("My guess is you were thinking of a moose.");
        }
        if (question1.equals("vegetable") && question2.equals("yes")) {
            System.out.println("My guess is you were thinking of a watermelon.");
        }
        if (question1.equals("mineral") && question2.equals("yes")) {
            System.out.println("My guess is you were thinking of a Camaro.");
        }
        System.out.println("I would ask you if I'm right, but I don't actually care!");
    }

}
