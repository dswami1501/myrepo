package com.java8.java8.Java7.StringLogicalQuestions;

import java.util.Scanner;

public class StringPalindrome {
	//What is palindrome, Answer:- sequence that reads the same backwards as forwards 
	//Simple logic for String Palindrome is that first reverse the string and then check if they are equal or not
	//Example:- Madam, 1881, racecar 
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter string to check whether palindrome or not");
		String str = read.nextLine();
		String reverse = "";// Space also counted as character
		System.out.println("Length of string is: " + str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
		reverse = reverse + str.charAt(i);
		}
		if (str.equalsIgnoreCase(reverse)) {
		System.out.println("The string is palindrome.");
		} else {
		System.out.println("The string is not palindrome.");
		}

	}

}
