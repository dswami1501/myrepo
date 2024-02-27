package com.java8.java8.Java7.NumberLogicalQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//A positive number is called armstrong number if it is equal to the sum of cubes of its each digits. for example 153= 1+ 125+27
		int num = 152, number, temp, total = 0;
		number = num;
		while (num != 0) {
		temp = num % 10;
		total = total + temp * temp * temp;
		System.out.println("Value of tempVariable " +temp);	
		num = num/10;
		System.out.println("Value of num Variable "+num);
		}
		if (total == number)
		System.out.println(number + " is an Armstrong number");
		else
		System.out.println(number + " is not an Armstrong number");
		
	}

}
