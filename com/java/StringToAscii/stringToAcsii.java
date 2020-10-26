package com.java.StringToAscii;
import java.util.Scanner;

/*
@author harshith kolagatla
Created Date : 16th october 2020
Functionality : program to convert string to ascii
* */
public class stringToAcsii {
    public static void main (String args[]) {

        StringToAsciiObject object=new StringToAsciiObject();
        object.setName("harshith");
        stringToAsciiLogic ascii =new stringToAsciiLogic();
        int[] result=ascii.toAscii(object.getName());
/*
prints the array of ascii value of
the given string
* */
        System.out.println("the ascii numbes of the given string are");
        for (int i=0; i< result.length; i++) {
            System.out.print(result[i]);
        }

    }
}
