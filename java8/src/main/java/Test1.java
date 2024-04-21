public class Test1 {
    public static void main(String[] args){
        String s1 = "Deepak";
        //String s2 = new String("Deepak");
        String s2 = "Deepak";
        System.out.println(s1==s2);
    }
}

/*public static void main(String[] args) throws InterruptedException{
        int counter =0;
        Thread t1 = new Thread(() ->{
            for(int i=0;i<1000;i++){
                counter++;
            }
        });
        Thread t2 = new Thread(() ->{
            for(int i=0;i<1000;i++){
                counter++;
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println( "answer = "+counter);
    }*/
