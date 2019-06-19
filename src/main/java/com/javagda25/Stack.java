package com.javagda25;

public class Stack<T> {
    private final static int INITIAL_ARRAYLIST_SIZE = 10;
    private int index;
    private int size = 0;
    private Object[] elements;

    public Stack(int initialSize) {
        this.elements = new Object[initialSize];
    }

    public Stack() {
        this.elements = new Object[INITIAL_ARRAYLIST_SIZE];
    }

    // push
    public void push(T object) {
        if (size >= elements.length) {
            extendTable();
        }
        elements[size] = object;
        index = size; // index = 0, 1, 2, 3, 4, 5
        size++;     // size = 1, ..., 6
    }

    public void extendTable() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    // pop
    public void pop() {

        if (index == 0 && elements[index]==null) {
            index--;
            size = 0;
            throw new ArrayIndexOutOfBoundsException("Stos jest pusty");
        } else {
            elements[index] = null; // elements[5] = null
            index--;                // index = 4
            size = index + 1;       // size = 5

        }

//        System.out.println(elements[index]);
    }

    // peek
    public void peek(){
        System.out.println(elements[index]);
    }

    // isEmpty
    public boolean isEmpty(){
        if(index==-1||(size==0 && elements[index]==null)){
            return true;
        }
        else {
            return false;
        }
    }
}
