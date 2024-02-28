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
