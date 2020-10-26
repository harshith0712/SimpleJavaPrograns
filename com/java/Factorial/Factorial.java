package com.java.Factorial;

/*
@author harshith kolagatla
Created Date : 15th october 2020
Functionality : program to print factorial of given number
* */
public class Factorial {
    public static void main (String args[]) {
        System.out.println("enter the number for factorial");
        FactorialLogic a=new FactorialLogic();
        FactorialObject b=new FactorialObject();
        int result=a.factorialNumber(b.getNumber());
/*
displays the factor of the given number
* */
        System.out.println("the factorial of the number is "+result);


    }
}
