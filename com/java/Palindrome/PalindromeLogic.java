package com.java.Palindrome;
/*
@author harshith kolagatla
Created Date : 15th october 2020
Functionality : this is the logic file which contains the logic
to check for palindrome of given number
* */
public class PalindromeLogic {
/*
Functionality : it takes the number as argument
if the number is palindrome it returns the number
* */
    public int palindromeNumber(int number) {
        int reverse=0,remainder;
        int num=number;
        while (num>0) {
            remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;
        }
        if (reverse==number)
            return number;
        return 0;
    }
}
