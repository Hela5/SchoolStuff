/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classrosterannotated;


/**
 * Domain/data class for the Class Roster application.  Holds all
 * information about a student.  This domain class is used by both the
 * ClassRosterUI and ClassRoster classes to accomplish their respective 
 * tasks.
 * 
 * @author apprentice
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private String cohort; // Java or .NET + cohort month/year

    // NOTE FOR APPRENTICES:  studentId is a read only field.  It is the only
    // value that we have to pass into the contructor.  All other fields on the
    // student object are read/write and MUST BE SET MANUALLY after a Student
    // object is instantiated.
    public Student(String studentId) {
        this.studentId = studentId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentId;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
    
    
    
}

