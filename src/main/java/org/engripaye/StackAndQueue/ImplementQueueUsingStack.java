package org.engripaye.StackAndQueue;

import java.util.Stack;

public class ImplementQueueUsingStack {

   // focused on Queue // queue is like a line at a park FIFO first in first out (the first gets on the ride)
    // stack is like a stack of plate LIFO last in first out (the last plate is the first you take out)


 private Stack<Integer> inputStack;
 private Stack<Integer> outputStack;

 public ImplementQueueUsingStack() {
     inputStack = new Stack<>();
     outputStack = new Stack<>();
 }

 public void push(int x) {
     inputStack.push(x); // always push to input stack

 }

 public int pop() {
     shiftStacks(); // move element if needed

     return outputStack.peek();
 }

 public int peek() {
     shiftStacks(); // Move elements
     return outputStack.peek();
 }

 public boolean empty() {
     return inputStack.isEmpty() && outputStack.isEmpty();
 }

    public void shiftStacks() {
     if(outputStack.isEmpty()) {
         while (!inputStack.isEmpty()) {
             outputStack.push(inputStack.pop()); // Reverse Order
         }
     }
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek());
        System.out.println(queue.pop());

        System.out.println(queue.empty());
    }
}
