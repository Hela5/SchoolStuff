/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.queue;

import com.swcguild.datastructures.stack.ArrayStack;
import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class ArrayQueue implements Queue {

    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] items;
    private int numItems = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue() {
        this(DEFAULT_INITIAL_SIZE);

    }

    public ArrayQueue(int size) {
        items = new Object[size];

    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public void enqueue(Object item) {
        if (isEmpty() == true) {
            head = 0;
            tail = 0;
        }

        if (numItems == items.length) {
            resize(2 * items.length);
        }

        if (tail == items.length) {
            tail = 0;
            items[tail++] = item;
        } else {
            items[tail++] = item;
            numItems++;
        }

    }

    @Override
    public Object dequeue() {
        if (numItems == 0) {
            return null;
        }
        Object item = items[head];
        items[head] = null;
        head++;
        numItems--;

        if (numItems == items.length / 4) {
            resize(items.length / 2);
        }
        return item;

    }

    private void resize(int newSize) {

        Object[] temp = new Object[newSize];
        for (int i = head, j = 0; j < numItems; j++, i++) {
            temp[j] = items[i % items.length];
        }
        items = temp;
        
    }

    @Override
    public Iterator iterator() {
        return new ArrayQueue.ArrayIterator();
    }

    private class ArrayIterator implements Iterator {

        private int i = head; // first element of for loop
        int counter = numItems;
        @Override
        public boolean hasNext() {
            return counter > 0;
        }

        @Override
        public Object next() {
            counter--;
            return items[i++];
            //return items
        }
    }
}
