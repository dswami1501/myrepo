package com.java8.java8.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElmtInTwoArray {
    public static void main(String[] args) {
        int[] num1 ={1,5,3,2};
        int[] num2 ={1,5,2,3,1,4,1};
        commonElements(num1, num2);
    }
    public static void commonElements(int[] ar1, int[] ar2){
        List<Integer> commonElement = Arrays.stream(ar1).filter(ar1N -> Arrays.stream(ar2).anyMatch(ar2N -> ar2N == ar1N)).boxed().collect(Collectors.toList());
        System.out.println(commonElement);
    }
}
