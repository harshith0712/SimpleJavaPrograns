package com.java.Factorial;

/*
@author harshith kolagatla
Created Date : 15th october 2020
Functionality : this is the logic file in which it contains the logic for factorial
* */
public class FactorialLogic {
/*
Functionality : here it takes the number as argument and computes factorial
and returns the factorial of the number
* */
    public int factorialNumber(int number) {

        int i;
        int fact=1;
        if (number==0)
            return 0;
        for(i=1; i<=number; i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
