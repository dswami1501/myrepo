package com.myjunit.myjunit.mycode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    void test(){
        MathUtils mathUtils = new MathUtils();
        int expected =2;
        int actual = mathUtils.add(1,1);
        //there are similar methods like assertArrayEquals and assertIterableEquals
        //Which verifies each item in the arrays are equal in the right position and verifies each item in the iterable are equal in the corresponding
        //positions respectively
        assertEquals(expected,actual,"the add method should have two inputs");
    }

    @Test
    void testCircleArea(){
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"This is circle area test");
    }

    @Test
    void testDivide(){
        MathUtils mathUtils = new MathUtils();
        //assertThrows(NullPointerException.class, () -> mathUtils.divide(1,0),"divide by 0 should throw");
        assertEquals(1,mathUtils.divide(1,1));
    }
}
