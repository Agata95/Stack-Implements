package com.javagda25;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println();


        stack.peek();
        stack.pop(); // 50
//
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        stack.pop();
        stack.peek();
        stack.pop();

        System.out.println(stack.isEmpty());





    }
}
