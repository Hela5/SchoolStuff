/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.stack;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class ArrayStack implements Stack {

    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] items;
    private int numItems = 0; //tells me how many items i have AND the index for next object

    public ArrayStack() {
        this(DEFAULT_INITIAL_SIZE);
    } //default size

    public ArrayStack(int size) {
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
    public void push(Object item) {
        if (numItems == items.length) {
            resize(2 * items.length);
        } //making sure there is space to keep allocating objects in array
        items[numItems++] = item;

    }

    @Override
    public Object pop() {
        if (numItems == 0) {
            return null;
        }

        Object item = items[--numItems];
        items[numItems] = null;

        if (numItems == items.length / 4) {
            resize(items.length / 2);
        }

        return item;
    }

    private void resize(int newSize) {
        //swap alogorithm 

        Object[] temp = new Object[newSize];
        for (int i = 0; i < numItems; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    @Override
    public Iterator iterator() {
        return new ReverseArrayIterator();
    }

    //if need to pop off, will be in proper order as you iterate
    private class ReverseArrayIterator implements Iterator {
        //INNERCLASS since it's not static

        private int i = numItems;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Object next() {
            return items[--i];
        }

    }
}
