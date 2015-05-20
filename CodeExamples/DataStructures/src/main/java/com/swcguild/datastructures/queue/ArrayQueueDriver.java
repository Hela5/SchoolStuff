/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.queue;

/**
 *
 * @author apprentice
 */
public class ArrayQueueDriver {

    public static void main(String[] args) {
        Queue q = new LinkedListQueue();

        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";

        q.enqueue(a);
        q.enqueue(b);
        q.enqueue(c);
        q.enqueue(d);
        q.enqueue(e);

        q.dequeue();
        q.enqueue(d);
        q.enqueue(e);
        for (Object o : q) {
            System.out.println(o);
        }
//
//        System.out.println("-------");
////        System.out.println(q.dequeue());
////
//        q.enqueue(d);
//        q.enqueue(e);
//        for (Object o : q) {
//            System.out.println(o);
//        }
    }
}
