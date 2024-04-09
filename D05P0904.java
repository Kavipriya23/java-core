package com.learning.core.day5session1;
public class D05P0904 {
	    private static final int MAX_SIZE = 100;
	    private int[] queue;
	    private int front, rear, size;

	   public D05P0904() {
	        queue = new int[MAX_SIZE];
	        front = rear = -1;
	        size = 0;
	    }
	    public void enqueue(int item) {
	        if (rear == MAX_SIZE - 1) {
	            System.out.println("Queue is full");
	            return;
	        }
	        if (front == -1)
	            front = 0;
	        queue[++rear] = item;
	        size++;
	    }
	    public int dequeue() {
	        if (front == -1 || front > rear) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        int item = queue[front++];
	        size--;
	        return item;
	    }
	    public void display() {
	        if (front == -1 || front > rear) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.print("Elements in Queue are: ");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    	D05P0904 queue = new D05P0904();
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.display();
	        int removedItem = queue.dequeue();
	        System.out.println("After removing first element: ");
	        queue.display();
	    }
	}

