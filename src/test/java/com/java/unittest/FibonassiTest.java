package com.java.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonassiTest {
    NumberSystem numberSystem = new NumberSystem();
    @Test
    void inputNumberZeroTest(){
        assertEquals(0, numberSystem.Fib(0));
    }
    @Test
    void inputNumberOne(){
        assertEquals(1, numberSystem.Fib(1));
    }
    @Test
    void inputNumberTwo(){
        assertEquals(1, numberSystem.Fib(2));
    }
    @Test
    void inputMultipleNumbers(){
        int[][] arrays = {
            {0,0},
            {1,1},
            {1,2},
            {2,3}
        };
        for(int i = 0; i< arrays.length ; i ++){
            assertEquals(arrays[i][0], numberSystem.Fib(arrays[i][1]));
        }
    }
}
