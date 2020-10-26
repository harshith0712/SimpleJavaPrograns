package com.java.Armstrong;
/*
@author harshith kolagatla
Created Dated : 15th october 2020
Functionality : this is the logic file contains the logic of armstrong number
* */
public class ArmstrongLogic {

    /*
    Functionality : this is the logic
    to check if the number is armstrong or not
    takes number as argument and returns true
    the number is armstrong
    * */
    public int armstrongNumber(int number) {
        int sum=0,remainder;
        int num=number;
        while (num>0) {
            remainder=num%10;
            sum+=(remainder*remainder*remainder);
            num=num/10;
        }
        if (sum==number)
            return number;
        return 0;
    }
}
