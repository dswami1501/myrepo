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
