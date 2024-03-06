package com.myjunit.myjunit.mycode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Utils1Test {
    Utils1 utils1;

    //There is a twist in a below beforeAllInit as it should be static
    @BeforeAll
    static void beforeAllInit(){
        System.out.println("This needs to run before all");
    }

    //Telling JUnit to execute this before each method runs
    @BeforeEach
    void init(){
        utils1 = new Utils1();
    }

    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning up .....");
    }

    @Test
    void test(){
        int expected =2;
        int actual = utils1.add(1,1);
        //there are similar methods like assertArrayEquals and assertIterableEquals
        //Which verifies each item in the arrays are equal in the right position and verifies each item in the iterable are equal in the corresponding
        //positions respectively
        assertEquals(expected,actual,"the add method should have two inputs");
    }

    @Test
    void testCircleArea(){
        assertEquals(314.1592653589793,utils1.computeCircleArea(10),"This is circle area test");
    }

    @Test
    void testDivide(){
        //assertThrows(NullPointerException.class, () -> mathUtils.divide(1,0),"divide by 0 should throw");
        assertEquals(1,utils1.divide(1,1));
    }
}
