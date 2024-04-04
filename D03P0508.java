package com.learning.core.day3session1;
import java.util.*;
public class D03P0508 {
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Taking input string
		        String inputString = scanner.nextLine();

		        // Checking if the string can be split into four distinct strings
		        boolean canBeSplit = checkStringSplit(inputString);

		        // Printing the result
		        if (canBeSplit) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		    }

		    public static boolean checkStringSplit(String str) {
		        int length = str.length();
		        
		        // Check if the length is divisible by 4
		        if (length % 4 != 0) {
		            return false;
		        }
		        
		        // Calculate the length of each sub-string
		        int subLength = length / 4;

		        // Create a set to store distinct sub-strings
		        Set<String> subStrings = new HashSet<>();
		        
		        // Iterate through the string, extracting sub-strings of length 'subLength'
		        for (int i = 0; i < length; i += subLength) {
		            String sub = str.substring(i, i + subLength);
		            if (subStrings.contains(sub)) {
		                return false; // If any sub-string is not distinct, return false
		            }
		            subStrings.add(sub);
		        }

		        return true;
		    }
	}
