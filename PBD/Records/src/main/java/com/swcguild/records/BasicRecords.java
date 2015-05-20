/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.records;

/**
 *
 * @author apprentice
 */
class studentInfo {

        String position;
        String name;
        int gradeClass;
        double average;

    }

public class BasicRecords {

    public static void printStudentInfo() {
        studentInfo one = new studentInfo();
        one.position = "first";
        one.name = "Esteban";
        one.gradeClass = 12;
        one.average = 79.3;

        studentInfo two = new studentInfo();
        two.position = "second";
        two.name = "Dave";
        two.gradeClass = 10;
        two.average = 91;

        studentInfo three = new studentInfo();
        three.position = "third";
        three.name = "Michelle";
        three.gradeClass = 11;
        three.average = 98.6;

        System.out.println("Enter the " + one.position + " student's name: " + one.name);
        System.out.println("Enter the " + one.position + " student's grade: " + one.gradeClass);
        System.out.println("Enter the " + one.position + " student's average: " + one.average);

    }
}
