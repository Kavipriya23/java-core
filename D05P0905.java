package com.learning.core.day5session1;
class Node {
	    int data;
	    Node next;
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	public class D05P0905 {
	    private Node front, rear;
	    public D05P0905() {
	        front = rear = null;
	    }
	    public void enqueue(int item) {
	        Node newNode = new Node(item);
	        if (rear == null) {
	            front = rear = newNode;
	            return;
	        }
	        rear.next = newNode;
	        rear = newNode;
	    }
	    public int dequeue() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        int item = front.data;
	        front = front.next;
	        if (front == null)
	            rear = null;
	        return item;
	    }
	    public void display() {
	        Node temp = front;
	        if (temp == null) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.print("Elements in Queue are: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    D05P0905 queue = new D05P0905();
	        queue.enqueue(89);
	        queue.enqueue(99);
	        queue.enqueue(109);
	        queue.enqueue(209);
	        queue.enqueue(309);
	        queue.display();
	        queue.dequeue();
	        queue.dequeue();
	        System.out.println("After removing two elements:");
	        queue.display();
	    }
	}
