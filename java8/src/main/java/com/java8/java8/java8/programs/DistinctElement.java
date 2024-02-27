package com.java8.java8.java8.programs;

import java.util.Arrays;

public class DistinctElement {
    public static void main(String[] args) {
        int[] num ={1,5,2,3,1,4,1};
        distinctElement(num);
    }
    public static void distinctElement(int[] bah){
        Arrays.stream(bah).distinct().forEach(bas -> System.out.print(bas));
    }
}
