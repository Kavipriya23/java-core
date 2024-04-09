package com.learning.core.day5session1;
import java.util.Scanner;
class Node1 {
    int data;
    Node next;
    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
public class D05P0902 {
    private Node top;
    public D05P0902() {
        this.top = null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void show() {
        Node temp = top;
        System.out.println("Elements in stack: ");
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        D05P0902 stack = new D05P0902();
        System.out.println("Enter elements to push into the stack (enter -1 to stop):");
        int input = scanner.nextInt();
        while (input != -1) {
            stack.push(input);
            input = scanner.nextInt();
        }
        System.out.println("Stack before popping twice:");
        stack.show();
        int popped1 = stack.pop();
        int popped2 = stack.pop();
        System.out.println("Stack after popping twice:");
        stack.show();
       // System.out.println("Popped elements: " + popped1 + ", " + popped2);
        scanner.close();
    }
}