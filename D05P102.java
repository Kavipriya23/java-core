package com.learning.core.day5session1;
import java.util.Scanner;
	public class D05P102 {
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = left + (right - left) / 2;

	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            merge(arr, left, mid, right);
	        }
	    }
	    public static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        for (int i = 0; i < n1; i++) {
	            L[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            R[j] = arr[mid + 1 + j];
	        }

	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Original array:");
	        printArray(arr);

	        mergeSort(arr, 0, size - 1);

	        System.out.println("Sorted array:");
	        printArray(arr);
	        
	        scanner.close();
	    }
	}

	