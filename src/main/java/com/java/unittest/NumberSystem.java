package com.java.unittest;

public class NumberSystem {

    public int Fib(int i) {
        if(i == 0){
            return 0;
        }else if(i == 1){
            return 1;
        }
        return Fib(i - 1) + Fib(i - 2);
    }
    
}
