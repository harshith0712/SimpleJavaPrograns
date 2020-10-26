package com.java.Armstrong;
import java.util.Scanner;

/*
@author harshith kolagatla
Created Date : 15th october 2020
functionality : program to print armstrong number
* */
public class Armstrong {
    public static void main(String args[]) {
        System.out.println("enter the number to check for armstrong");
        ArmstrongObject object=new ArmstrongObject();
        object.setNumber(153);
        ArmstrongLogic armstrong = new ArmstrongLogic();
        int result = armstrong.armstrongNumber(object.getNumber());
        if (result > 0)
/*
prints if the number is armstrong
* */
            System.out.println("the armstrong number is " + result);
    }
}