package com.java.Fibonacci;
import java.util.Scanner;

/*
/*
@author harshith kolagatla
Created Date : 16th october 2020
Functionality : program to print fibonacci until given limit
* */
public class Fibonacci {
    public static void main (String args[]) {
        FibonacciObject object=new FibonacciObject();
        object.setLimit(12);
        FibonacciLogic fibonacci=new FibonacciLogic();
        int[] result=fibonacci.fibonacciNumbers(object.getLimit());
/*
to print the limited fibonacci numbers
* */
        System.out.print("0 1 ");
        for(int i=0; i< object.getLimit()-2; i++) {
            System.out.print(result[i]+" ");
        }

    }
}
