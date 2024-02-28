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