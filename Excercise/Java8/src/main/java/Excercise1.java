import java.util.function.Predicate;

public class Excercise1{
    public static void main(String[] args){
        //TODO: Predicate and Predicate chaining
        Predicate<String> chkLengthOfString = name -> name.length()>5;
        System.out.println("chkLengthOfString: "+chkLengthOfString.test("Deepak"));

        Predicate<String> chkEvenOrOdd = name -> name.length()%2==0;
        System.out.println("chkEvenOrOdd: "+chkEvenOrOdd.test("Swami"));

        //TODO: Predicate chaining use : and, or and negate
        System.out.println("Test: "+chkLengthOfString.and(chkEvenOrOdd).test("swami"));
    }
}
