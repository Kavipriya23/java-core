package com.learning.core.day3session1;
import java.util.*;
public class D03P0503 {
	private static void printsubCombinations(String str, String curr, int index) {
		if (index == str.length()) {
			System.out.print(curr + " ");
			return;
		}
		printsubCombinations(str, curr + str.charAt(index), index + 1);
		printsubCombinations(str, curr, index + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		printsubCombinations(input, "", 0);
		scanner.close();
	}
}