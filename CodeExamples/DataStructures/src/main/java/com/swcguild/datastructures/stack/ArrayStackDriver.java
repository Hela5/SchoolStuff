/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.stack;

/**
 *
 * @author apprentice
 */
public class ArrayStackDriver {

    public static void main(String[] args) {
        Stack s = new LinkedListStack();

        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";

        s.push(a);
        s.push(b);
        s.push(c);
        s.push(d);
        s.push(e);

        for (Object o : s) {
            System.out.println(o);
        }
        System.out.println("-------");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
