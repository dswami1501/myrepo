package com.java8.java8.Java7.NumberLogicalQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n, reverse = 0;
		 
		 System.out.println("Enter an integer to reverse");
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();//25
		 
		 while(n != 0)//2
		 {
		 reverse = reverse * 10;//50
		 reverse = reverse + n%10;//52
		 n = n/10;//0
		 }
		 
		 System.out.println("Reverse of the number is " + reverse);

	}

}

