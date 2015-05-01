/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.inheritance;

/**
 *
 * @author apprentice
 */
public class Circle extends Shape {

    double pi = Math.PI;
    double radius;

    public void perimeter() {
        super.perimeter();
        System.out.println(2  * pi * radius);
    }

    public void area() {
        super.area();
        System.out.println(pi * radius * radius);
    }

}
