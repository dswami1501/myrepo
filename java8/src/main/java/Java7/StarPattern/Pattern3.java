package com.java8.java8.Java7.StarPattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows needed to print the pattern");
		int systemInput = s.nextInt();
		System.out.println("## Printing the pattern ##");
		
		for(int i=1; i<=systemInput;i++){
			for(int j=systemInput; j>=i ;j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*output*/
/*Enter the number of rows needed to print the pattern 
5
## Printing the pattern ##
*****
**** 
***  
**   
* */