package org.engripaye.StackAndQueue;

import java.util.Stack;

public class MinStack {

    // get the smallest number in a stack // pop means remove the smallest and return the next number

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push (int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val); // keep track of the minimum value
        }
    }
    public void pop() {
        if(stack.pop().equals(minStack.peek())){
            minStack.pop(); // Remove from min stack if it was the minimum
        }
    }
    public int top () {
        return stack.peek(); // Get the top element
    }
    public int getMin() {
        return minStack.peek(); // get the minimum value
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);

        System.out.println(minStack.getMin()); // 3

        minStack.push(2);
        minStack.push(1);

        System.out.println(minStack.getMin()); // 1

        minStack.pop();

        System.out.println(minStack.getMin()); // 2
    }
}
