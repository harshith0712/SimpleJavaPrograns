package com.java.Prime;
/*
@author harshith kolagatla
Created Date : 15th october 2020
Functionality : this is the logic file which contains logic
for checking the number is prime

* */
public class PrimeLogic {
/*
Functionaly : it takes the number as argument
if the number is prime it returns the number
* */
    public int primeNumber(int number) {
        int i;
        int flag=0;
        for (i = 2; i < number; i++) {
            if (number % i == 0)
                flag=1;
        }
        if (flag==0)
            return number;
        return 0;
    }
}
