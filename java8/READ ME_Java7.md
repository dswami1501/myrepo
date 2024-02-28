# <u> NumberLogicalQuestions </u>
## *ArmstrongNumber*
```java
package Java7.NumberLogicalQuestions;

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
```

## *Factorial*
```java
package Java7.NumberLogicalQuestions;

public class Factorial {
	//Factorial Program in Java: Factorial of n is the product of all positive descending integers. 		
	//Factorial of n is denoted by n!. For example: 4! = 4*3*2*1 = 24, 5! = 5*4*3*2*1 = 120	
	public static void main(String[] args) {
		int n = 5, fact = 1;
		for (int i = 1; i <= n; i++) {
		fact= fact*i;
		System.out.print(fact + ", ");
		}
		System.out.println();
		System.out.println("factorial of no. is:- "+ fact);
	}
}
```

## *FibonacciSeries*
```java
package Java7.NumberLogicalQuestions;

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
```

## *NumberPalindrome*
```java
package Java7.NumberLogicalQuestions;

public class NumberPalindrome {
	public static void main(String[] args) {
		int r, sum = 0, temp;
		int n = 656;// It is the number variable to be checked for palindrome		
		temp = n;
		while (n > 0) {//checking for no 101
		r = n % 10; // getting remainder
		/*System.out.println("remainder "+r);//1
*/		sum = (sum * 10) + r;
		/*System.out.println("total sum "+sum);//101
*/		n = n / 10;
		/*System.out.println("quotient "+n);//1
*/		}
		if (temp == sum)
		System.out.println("palindrome number ");
		else
		System.out.println("not palindrome");
	}
}
```

## *RemoveDuplicateElementFromArray*
```java
package Java7.NumberLogicalQuestions;

public class RemoveDuplicateElementFromArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 5, 5, 5, 5 };
		int j = 0;
		
		for (int i = 0; i < a.length - 1; i++) {
			
			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;
			}
		}
		a[j] = a[a.length - 1];
		for (int i = 0; i < j + 1; i++) {
			System.out.println(a[i] + " ");
		}
	}
}

```

## *ReverseNumber*
```java
package Java7.NumberLogicalQuestions;

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
```

# <u> Programs </u>
## *MissingElementInAnArray*
```java
package Java7.programs;

public class MissingElementInAnArray {
    //n * (n + 1) / 2 is a well-known formula for finding the sum of the first n natural numbers
    //This formula is derived from the arithmetic series sum formula.
    public static void main(String[] args) {
        int[] ar ={1,4,3,5};
        System.out.println("\nMissing Element is: "+missingElementInArray(ar));
    }
    public static int missingElementInArray(int[] ar){
        int n = ar.length+1;
        System.out.println("n value is: "+n);
        int expectedSum = n*(n+1)/2;
        int originalSum=0;
        for(int num: ar){
            System.out.print(num +", ");
            originalSum = originalSum+num;
        }
        return expectedSum-originalSum;
    }
}
```

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

# <u> StringLogicalQuestions </u>
## *DuplicateWordstring*
```java
package Java7.StringLogicalQuestions;

import java.util.HashMap;
import java.util.Iterator;

//Calculate duplicate words in string
public class DuplicateWordstring {
	static void findDuplicateWord(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" ");
		
		for (String tempString : s) {
			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}
		}
		
		Iterator<String> tempString = hm.keySet().iterator();
		
		while (tempString.hasNext()) {
			String temp = tempString.next();
			if (hm.get(temp) > 1) {
				System.out.println("the word " + temp + " appeard " + 
				hm.get(temp) + " no of times");
			}
		}		
	}
	
	static void findDuplicateCharacers(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		findDuplicateWord("I am am am Learning java java am");
		findDuplicateCharacers("Aaabbbcdd");			
	}
}
```

## *ReverseString*
```java
package Java7.StringLogicalQuestions;

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
```

## *ReverseStringinPlace*
```java
package Java7.StringLogicalQuestions;

public class ReverseStringinPlace {
	public void reverseWordInMyString(String str)
	 {
	/* The split() method of String class splits
	 * a string in several strings based on the
	 * delimiter passed as an argument to it
	 */
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
	 {
		 String word = words[i]; 
		 String reverseWord = "";
		 
		 for (int j = word.length()-1; j >= 0; j--) 
		 {
			/* The charAt() function returns the character
			 * at the given position in a string
			 */
			 reverseWord = reverseWord + word.charAt(j);
		 }
		 reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
	 }

	public static void main(String[] args) {
		ReverseStringinPlace obj = new ReverseStringinPlace();
		obj.reverseWordInMyString("Welcome to BeginnersBook");
		obj.reverseWordInMyString("This is an easy Java Program");
	}
}
```

## *StringLengthWithoutUsingLengthFunction*
```java
package Java7.StringLogicalQuestions;

public class StringLengthWithoutUsingLengthFunction {
	public static void main(String[] args) {
		//Java string length without using length() method
		String test="Deepak";
		int i = 0;
		for(char c :test.toCharArray()){
			System.out.println(c);
			i++;
		}
		System.out.println("length is "+i);
	}
}
```

## *StringPalindrome*
```java
package Java7.StringLogicalQuestions;

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
```

## *SwapStringUsingThirdVariable*
```java
package Java7.StringLogicalQuestions;

public class SwapStringUsingThirdVariable {
	public static void main(String[] args) {
		String x = "Deepak";
		String y = "Swami";
		System.out.println("Before Swapping:- x: " + x + " y: " + y);
		String temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping:- x: " + x + " y: " + y);
	}
}
```

## *SwapStringWithoutUsingThirdVariable*
```java
package Java7.StringLogicalQuestions;

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
```