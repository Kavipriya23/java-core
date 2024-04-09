package com.learning.core.day5session1;
public class D05P0901 {
	    private int maxSize; // Maximum size of stack
	    private int[] stackArray;
	    private int top; // Top of stack
	    
	    // Constructor to initialize stack with given size
	    public D05P0901 (int size) {
	        maxSize = size;
	        stackArray = new int[maxSize];
	        top = -1;
	    }
	    
	    // Method to push element onto the stack
	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("Stack overflow! Cannot push element onto stack.");
	        } else {
	            stackArray[++top] = element;
	            System.out.println(element + " pushed onto stack");
	        }
	    }
	    // Method to pop element from the stack
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack underflow! Cannot pop element from empty stack.");
	            return -1;
	        } else {
	            int poppedElement = stackArray[top--];
	            System.out.println(poppedElement + " popped from stack");
	            return poppedElement;
	        }
	    }
	    
	    // Method to check if stack is empty
	    public boolean isEmpty() {
	        return (top == -1);
	    }
	    
	    // Method to check if stack is full
	    public boolean isFull() {
	        return (top == maxSize - 1);
	    }
	    
	    // Method to peek at the top element of the stack
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty! No element to peek.");
	            return -1;
	        } else {
	            return stackArray[top];
	        }
	    }
	    public static void main(String[] args) {
	    	D05P0901 stack = new D05P0901(5);
	        // Pushing elements onto the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);
	        // Trying to push onto full stack
	        stack.push(60);
	        // Peeking at the top element
	        System.out.println("Top element of stack: " + stack.peek());
	        // Popping elements from the stack
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        // Trying to pop from empty stack
	        stack.pop();
	    }
	}