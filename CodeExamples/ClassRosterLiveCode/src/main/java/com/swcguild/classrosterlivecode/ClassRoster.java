/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classrosterlivecode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ClassRoster {

    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    HashMap<String, Student> students = new HashMap<>();

    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    public Student addStudent(String studentId, Student student) {
        return students.put(studentId, student);
    }

    public Student removeStudent(String studentId) {
        return students.remove(studentId);
    }

    public void writeRoster() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(ROSTER_FILE));
        Collection<Student> studentCollection = students.values();

        //iterate over collection of student
        for (Student currentStudent : studentCollection) {
            out.println(currentStudent.getStudentId() + DELIMITER +
                    currentStudent.getFirstName() + DELIMITER +
                    currentStudent.getLastName() + DELIMITER +
                    currentStudent.getCohort());
            out.flush();
        } 
        out.close();
    }
    
    public void loadRoster() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        String currentLine;
        String[] currentTokens;
        
        while (sc.hasNextLine()) {
            //get next line in file
            currentLine = sc.nextLine();
            //break line into tokens
            currentTokens = currentLine.split(DELIMITER);
            
            Student currentStudent = new Student(currentTokens[0]);
            currentStudent.setFirstName(currentTokens[1]);
            currentStudent.setLastName(currentTokens[2]);
            currentStudent.setCohort(currentTokens[3]);
            
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        sc.close();
    }

}
