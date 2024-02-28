# <u> StarPattern </u>
## *Pattern1*
```java
package Java7.StarPattern;

import java.util.Scanner;

public class Pattern1 {	
	public static void main(String[] args){
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
        // Print i number of stars
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
	}
}

/*output*/
/*Enter the number of rows needed to print the pattern 
5
## Printing the pattern ##
*
**
***
****
***** */
```

## *Pattern2*
```java
package Java7.StarPattern;

import java.util.Scanner;

public class Pattern2 {
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
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
	}
}
/*OUTPUT*/
/*Enter the number of rows needed to print the pattern 
5
## Printing the pattern ##
    *
   **
  ***
 ****
***** */
```

## *Pattern3*
```java
package Java7.StarPattern;

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
```

## *Pattern4*
```java
package Java7.StarPattern;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows needed to print the pattern");
		int systemInput = s.nextInt();
		System.out.println("## Printing the pattern ##");
		
		for(int i=1; i<=systemInput;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=systemInput;k>=i;k--){
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
```

## *Pattern5*
```java
package Java7.StarPattern;

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
```

## *Pattern6*
```java
package Java7.StarPattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();

        System.out.println("## Printing the pattern ##");

        for (int i=rows; i>=1; i--)
        {
            // Print space in increasing order
            for (int j=rows; j>=i; j--)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();

    }

}
/*output*/
/*Enter the number of rows needed to print the pattern 
5
## Printing the pattern ##
*********
 *******
  *****
   ***
    * */
```

## *Pattern7*
```java
package Java7.StarPattern;

public class Pattern7 {
	public static void main(String[] args) {
	}
}
/*output*/
/*Enter the number of rows needed to print the pattern 
5
## Printing the pattern ##
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * */
```