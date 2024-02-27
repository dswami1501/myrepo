package com.java8.java8.java8.programs;

import java.util.Arrays;
import java.util.List;

public class ScndSmllstElmFrmIntArrNdReduceDemo {
    public static void main(String[] args) {
        int[] num ={5,2,6,5,3,4,1};
        //Code snippet for reduce
        List<Integer> reduceDemo = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("reduceDemo: "+reduceDemo.stream().reduce((a,b)->a+b).get());
        //Code snippet for reduce
        fetchSecSmllstElm(num);
    }
    public static void fetchSecSmllstElm(int[] dac){
        int i = Arrays.stream(dac).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Doesn't have second smallest element"));
        System.out.println("Second smallest elememt in the given arr: "+i);
    }
}
