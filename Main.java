package com.StackMinMax;



public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(50);
        System.out.println("min " + stack.min());
        System.out.println("max " + stack.max());


    }
}
