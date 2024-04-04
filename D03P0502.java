package com.learning.core.day3session1;
import java.util.Scanner;
  public class D03P0502 {
	          public static void main(String[] args) {
	        	  Scanner scanner = new Scanner(System.in);
	      		String s = scanner.nextLine();
	      		char[] c = s.toCharArray();
	      		int vowel=0;
	      		
	      		for (int i = 0; i < s.length(); i++) { 
	                  if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
	                      vowel++; 
	      		}
	        
	      	System.out.println(vowel);
	          }
  }