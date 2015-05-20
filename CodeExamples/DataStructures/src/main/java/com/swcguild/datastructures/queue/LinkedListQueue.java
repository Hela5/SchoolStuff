/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.queue;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class LinkedListQueue implements Queue {

    private Node first;
    private Node last;
    private int numItems;
    private int head;
    private int tail;

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public void enqueue(Object item) {

        Node oldLast = last;
        last = new Node();
        last.item = item;
//        oldLast.next = last;
        if (oldLast != null) {
            oldLast.next = last;
        }

        if (numItems == 0) {
            first = last;
//            last = new Node();
//            tail++;
//            head = 0;
//            last = prevFirst;
        }

        if (numItems == 1) {
            first.next = last;
//            last = new Node();
        }

        numItems++;
    }

    @Override
    public Object dequeue() {
        if (numItems == 0) {
            return null;
        }

        Object ret = first.item;
        first = first.next;
        numItems--;
        head++;
        return ret;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            if (current == null) {
                return null;
            }
            Object ret = current.item;
            current = current.next;
            return ret;
        }

    }

    private class Node {

        Object item;
        Node next;

    }

}
