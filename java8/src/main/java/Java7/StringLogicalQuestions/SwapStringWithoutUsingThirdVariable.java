package com.java8.java8.Java7.StringLogicalQuestions;

public class SwapStringWithoutUsingThirdVariable {

	public static void main(String[] args) {
		String x = "deepak";
		String y = "swami";
		System.out.println("before swapping, x:- "+x +" y:- "+y );
		x = x.concat(y);
		System.out.println("After concating "+x);
		y = x.substring(0,(x.length()-y.length()));
		System.out.println("Value of x.length()-y.length() "+ (x.length()-y.length()));
		x = x.substring(y.length());//here y.length is 6 so leftout first 6 characters		
		System.out.println("before swapping, x:- "+x +" y:- "+y );

	}

}
