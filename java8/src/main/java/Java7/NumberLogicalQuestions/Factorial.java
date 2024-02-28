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
