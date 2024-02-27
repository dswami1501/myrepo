package com.java8.java8.java8.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayOfIntegerInPlace {
    public static void main(String[] args) {
        int[] num ={5,2,6,5,3,4,1};
        reverseArrInPlace(num);
    }
    public static void reverseArrInPlace(int[] abc){
        IntStream.range(0, abc.length/2).forEach(i -> {
            int temp = abc[i];
            abc[i]=abc[abc.length-i-1];
            abc[abc.length-i-1]= temp;
        });
        System.out.println("Reverse Array: "+Arrays.toString(abc));
    }
}
