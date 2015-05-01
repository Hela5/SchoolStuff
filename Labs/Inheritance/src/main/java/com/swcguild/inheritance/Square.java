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
public class Square extends Shape {

    int side;

    public void perimeter() {
        super.perimeter();
        System.out.println(side * 4);
    }
    
    public void area() {
        super.area();
        System.out.println(side + side);
    }
           
}
