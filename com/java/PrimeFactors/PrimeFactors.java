package com.java.PrimeFactors;
import java.util.Scanner;

/*
@author harshith kolagatla
Created Date : 16th october 2020
Functionality : program to print prime factors of a number
* */
public class PrimeFactors {
    public static void main(String args[]) {
/*
reads the number for prime factors
* */
        PrimeFactorsObject object=new PrimeFactorsObject();
        object.setNumber(21);
        PrimeFactorsLogic factors =new PrimeFactorsLogic();
        int[] result=factors.primeFactors(object.getNumber());
/*
prints the prime factors of the number
* */
        System.out.println("the prime factors of the number are ");
        for(int i=0;i< object.getNumber();i++) {
            if(result[i]>0)
            System.out.print(result[i]+" ");
        }

    }
}
