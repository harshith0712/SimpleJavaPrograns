package com.java.PrimeFactors;
/*
@author harshith kolagatla
Created Date : 16th october 2020
Functionality : this is the logic file in which it contains the logic
for prime factors
* */
public class PrimeFactorsLogic {
/*
Functionalities : takes the number as argument
and returns the array of prime factors
* */
    int flag=0;
    public int[] primeFactors(int number) {
        int[] array=new int[number];
        for(int i=2; i<number; i++) {
            if((number%i)==0) {
                for(int j=2; j<i;j++) {
                    if ((i%j)==0)
                        flag=1;
                    break;
                }
                if (flag==0)
                    array[i]=i;
            }
        }
        return array;
    }
}
