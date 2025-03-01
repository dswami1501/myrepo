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
