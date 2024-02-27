package com.java8.java8.Java7.StarPattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
        for (int i=1; i<=rows; i++) 
        { 
            // Print space in decreasing order 
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

	}

}
/*Output*/
/*Enter the number of rows needed to print the pattern 
5
## Printing the pattern ##
    *
   ***
  *****
 *******
********* */