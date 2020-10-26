package com.java.Prime;
import java.util.Scanner;

/*
@author harshith kolagatla
Created Date : 15th october 2020
Functionality : program to check prime for the given number
* */
public class Prime {
    public static void main(String args[]) {
/*
reads the number for prime
* */
        PrimeObject object=new PrimeObject();
        object.setNumber(23);
        PrimeLogic prime = new PrimeLogic();
        int result=prime.primeNumber(object.getNumber());
/*
it prints if the number is prime
* */
        if(result>0)
        System.out.println("the prime number is "+result);

    }
}
