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
public class Triangle extends Shape {
    int base;
    int height;
    int side1;
    int side2;
    int side3;

    public void perimeter() {
        super.perimeter();
        System.out.println(side1+ side2 + side3);
    }

    public void area() {
        super.area();
        System.out.println(.5 * base * height);
    }

}
