package com.learning.core.day5session1;
public class D05P0906 {
	private static final int MAX_SIZE = 100;
	private int[] queue;
	private int front, rear, size;
 public D05P0906() {
	     queue = new int[MAX_SIZE];
	     front = rear = -1;
	     size = 0;
	    }
	    public void enqueue(int item) {
	        if ((rear + 1) % MAX_SIZE == front) {
	            System.out.println("Queue is full");
	            return;
	        }
	        if (isEmpty())
	            front = rear = 0;
	        else
	            rear = (rear + 1) % MAX_SIZE;
	        queue[rear] = item;
	        size++;
	    }
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        int item = queue[front];
	        if (front == rear)
	            front = rear = -1;
	        else
	            front = (front + 1) % MAX_SIZE;
	        size--;
	        return item;
	    }

	    public boolean isEmpty() {
	        return front == -1;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.print("Elements in circular queue are: ");
	        int i = front;
	        do {
	            System.out.print(queue[i] + " ");
	            i = (i + 1) % MAX_SIZE;
	        } while (i != (rear + 1) % MAX_SIZE);
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    	D05P0906 circularQueue = new D05P0906();
	        circularQueue.enqueue(14);
	        circularQueue.enqueue(13);
	        circularQueue.enqueue(22);
	        circularQueue.enqueue(-8);
	        circularQueue.display();
	        int removedItem = circularQueue.dequeue();
	        System.out.println("After removing first element: ");
	        circularQueue.display();
	    }
	}
