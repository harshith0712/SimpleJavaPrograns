package com.java.Palindrome;
import java.util.Scanner;

/*
@author harshith kolagatla
Created Date : 15th october 2020
Functionality : program to check the given number is palindrome
* */
public class Palindrome {
    public static void main (String args[]) {
/*
reads the number for palindrome
* */
        System.out.println("enter the number to check for palindrome");
        PalindromeObject object=new PalindromeObject();
        object.setNumber(121);
        PalindromeLogic palindrome =new PalindromeLogic();
        int result = palindrome.palindromeNumber(object.getNumber());
/*
it prints the number if palindrome
* */
        if (result>0)
            System.out.println("the palindrome number is "+result);

    }
}
