/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classrosterlivecode;

import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {
        try {
            ClassRoster roster = new ClassRoster();
            Student currentStudent = new Student("0001");
            currentStudent.setFirstName("Joe");
            currentStudent.setLastName("Smith");
            currentStudent.setCohort("Java-April2015");

            roster.addStudent(currentStudent.getStudentId(), currentStudent);

            roster.writeRoster();

            ClassRoster readRoster = new ClassRoster();
            Student studentFromFile = readRoster.getStudent("0001");
            if (studentFromFile == null) {
                System.out.println("Roster Empty as expected.");
            } else {
                System.out.println("Unexpected Student present.");
                return;
            }
            
            readRoster.loadRoster();
            studentFromFile = readRoster.getStudent("0001");
            System.out.println(studentFromFile.getFirstName() + " " + studentFromFile.getLastName());

        } catch (IOException ex) {
            System.out.println("Error IOException occurred. Message = " + ex.getMessage());
        }
    }
}
