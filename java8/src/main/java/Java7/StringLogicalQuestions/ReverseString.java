package com.java8.java8.Java7.StringLogicalQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = "";//Space also counted as character
		System.out.println("Length of string is: "+str.length());
		for(int i = str.length() - 1; i >= 0; i--)
		{
		reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed string is:");
		System.out.println(reverse);

	}

}
