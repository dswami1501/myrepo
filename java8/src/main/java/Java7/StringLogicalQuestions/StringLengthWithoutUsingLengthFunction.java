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
