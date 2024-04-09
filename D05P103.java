package com.learning.core.day5session1;
	import java.util.Scanner;
	public class D05P103{
	    public static void linearSearch(int[] arr, int key) {
	        boolean found = false;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                System.out.println("Element " + key + " found at index " + i + " in the array.");
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Element " + key + " not found in the array.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of arrays: ");
	        int numArrays = scanner.nextInt();

	        for (int i = 1; i <= numArrays; i++) {
	            System.out.print("Enter the size of array " + i + ": ");
	            int size = scanner.nextInt();

	            int[] arr = new int[size];
	            System.out.print("Enter the elements of array " + i + ": ");
	            for (int j = 0; j < size; j++) {
	                arr[j] = scanner.nextInt();
	            }

	            System.out.print("Enter the element to search in array " + i + ": ");
	            int key = scanner.nextInt();

	            linearSearch(arr, key);
	        }

	        scanner.close();
	    }
	}
