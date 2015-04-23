/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.hashmaps;

import static com.swcguild.hashmaps.ConsoleIO.displayUserString;
import static com.swcguild.hashmaps.ConsoleIO.queryUserInt;
import static com.swcguild.hashmaps.ConsoleIO.queryUserString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class StudentQuizScores {

    String studentName = "";

    HashMap<String, ArrayList> studentInfo = new HashMap<>();

    public void go() {
        System.out.println("Welcome to Student Score Info.");
        int userResponse = 0;

        do {
            userResponse = queryUserInt("Do you want to: \r 1) Add a Student. \r 2) View Student. \r 3) Remove Student. \r 4) View Student Scores. \r 5) View Student's Average Quiz Score. \r 6) Quit.");
            switch (userResponse) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;

                case 3:
                    removeStudent();
                    break;

                case 4:
                    viewStudentScores();
                    break;

                case 5:
                    averageScores();
                    break;

                case 6:
                    displayUserString("Goodbye!");
                    break;

                default:
                    displayUserString("Try again.");
                    break;
            }
        } while (userResponse != 6);
    }

    public void addStudent() {
        ArrayList<Integer> studentScores = new ArrayList<>();
        studentName = queryUserString("What is your student's name?");
        String moreScores = "";
        do {
            studentScores.add(queryUserInt("Please add a quiz score: "));
            moreScores = queryUserString("Are there more scores to add? Yes or No?");
        } while (moreScores.equals("Yes"));

        studentInfo.put(studentName, studentScores);
    }

    public void viewStudent() {
        Set<String> allStudents = studentInfo.keySet();
        for (String nameKey : allStudents) {
            displayUserString(nameKey);
        }
    }

    public void removeStudent() {
        String removeStudent = queryUserString("Which student would you like to remove?");
        studentInfo.remove(removeStudent);
    }

    public void viewStudentScores() {
        String studentToView = queryUserString("Which student's scores would you like to view?");
        ArrayList<Integer> scores = studentInfo.get(studentToView);
        for (Integer scoreView : scores) {
            displayUserString(Integer.toString(scoreView));
        }
    }

    public void averageScores() {
        int sumScores = 0;
        int counter = 0;
        String studentToView = queryUserString("Who's scores would you like to average?");
        ArrayList<Integer> scores = studentInfo.get(studentToView);
        for (Integer scoreValue : scores) {
            sumScores += scoreValue;
            counter++;
        }
        int average = sumScores / counter;
        displayUserString(Integer.toString(average));
    }
}
