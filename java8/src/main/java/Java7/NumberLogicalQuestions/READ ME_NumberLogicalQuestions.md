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

# <u>  </u>
## **
```java
```