package com.java8.java8.Java7.NumberLogicalQuestions;

import java.util.Scanner;

public class FibonacciSeries {
//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc. 		
	public static void main(String[] args) {
		int n, a = 0, b = 1, sum;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n:");
		n = s.nextInt();
		System.out.print("Fibonacci Series:");
		System.out.print(a+" "+b+" ");
		for (int i = 2; i < n; i++) {
			sum = a + b;
			 a = b;
			 b = sum;
			System.out.print(sum + " ");
		}
	}
}
