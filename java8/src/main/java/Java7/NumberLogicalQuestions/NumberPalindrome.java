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
