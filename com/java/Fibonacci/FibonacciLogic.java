package com.java.Fibonacci;
/*
@author harshith kolagatla
Created Date : 16th october 2020
Functionality : this is the logic file in which it contains the logic for fibonacci
* */
public class FibonacciLogic {
/*
Functionality : it takes the limit as argument and
returns the fibonacci upto the limit
* */
    int a=0;
    int b=1;
    int c;
    public int[] fibonacciNumbers (int limit) {
        int[] array=new int[limit];
        for (int i=0; i<limit; i++) {
            c=a+b;
            array[i]=c;
            a=b;
            b=c;

        }
        return array;
    }
}
