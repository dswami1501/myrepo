package java8.programs;

public class EvenAndOddPrinterBy2Threads implements Runnable{
    static int count=1;
    Object obj;

    public EvenAndOddPrinterBy2Threads(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        while (count<=10){
            if (count<=10 && count%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (obj){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+" value: "+count);
                    count++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (count<=10 && count%2!=0 && Thread.currentThread().getName().equals("odd")){
                synchronized (obj){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+" value: "+count);
                    count++;
                    obj.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object customLock = new Object();
        Runnable r1 = new EvenAndOddPrinterBy2Threads(customLock);
        Runnable r2 = new EvenAndOddPrinterBy2Threads(customLock);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }
}
