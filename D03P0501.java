package com.learning.core.day3session1;
import java.util.Scanner;
		public class D03P0501 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a string:");
		        String inputString = scanner.nextLine();

		        // Display the length of the string
		        //System.out.println("Length of the string: " + inputString.length());

		        // Convert to uppercase and display
		        //String uppercaseString = inputString.toUpperCase();
		        //System.out.println("String in uppercase: " + uppercaseString);

		        // Check if the string is a palindrome
		        if (isPalindrome(inputString)) {
		            System.out.println("It is a Palindrome.");
		        } else {
		            System.out.println("It is not a Palindrome.");
		        }

		        scanner.close();
		    }

		    // Helper method to check if a string is a palindrome
		    private static boolean isPalindrome(String str) {
		        String cleanStr = str.toLowerCase(); // Consider the string in a case-insensitive manner
		        int i = 0;
		        int j = cleanStr.length() - 1;

		        while (i < j) {
		            if (cleanStr.charAt(i) != cleanStr.charAt(j)) {
		                return false; // Not a palindrome if characters at mirroring positions are different
		            }
		            i++;
		            j--;
		        }
		        return true; // String is a palindrome if the whole string has been checked without mismatches
		    }
	}

