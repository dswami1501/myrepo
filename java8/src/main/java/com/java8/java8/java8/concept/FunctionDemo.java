package com.java8.java8.java8.concept;

import java.util.function.Function;

public class FunctionDemo {
//Todo:Done
    public static void main(String[] args) {
        //Note:- run this program for observation
        //For chaining use: andThen(), compose()

        Function<Integer,Integer> doubleIt = i ->2*i;
        System.out.println("After doubling: "+doubleIt.apply(2));

        Function<Integer,Integer> cubeIt = i ->i*i*i;
        System.out.println("After doubling: "+cubeIt.apply(2));

        System.out.println("First Doubling Using Apply: "+doubleIt.andThen(cubeIt).apply(2));

        System.out.println("First Cubing Using Compose: "+doubleIt.compose(cubeIt).apply(2));
    }
}
