public class Test1 {
    public static void main(String[] args) {
        /*input sting: "  my    name  is       deepak  ";
        output: My Name Is Deepak*/

        /*Builder pattern*/
        /*Feature interface;*/
        /*Cloning*/
        /*Can we write try catch in lambdas*/
        //Find the second largest element in array
        //Difference between final and static keyword
        String input = "  my    name  is       deepak  ";

        gettingNormalString(input);

    }
    public static void gettingNormalString(String t){
        String[] s = t.split(" ");
        for (String s1:s)
        System.out.println(s.length);
    }
}
