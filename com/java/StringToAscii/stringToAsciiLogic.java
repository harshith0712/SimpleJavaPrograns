package com.java.StringToAscii;
/*
@author harshith kolagatla
Created Date : 15th october 2020
Functionality : this is the logic file in which it contains the logic
string to acsii
* */
public class stringToAsciiLogic {
/*
Functionality : takes string name as argument
and returns array of ascii values
* */
    public int[] toAscii(String name) {
        int l=name.length();
        int convert;
        int[] array=new int[l];
        for(int i=0; i<l; i++) {
            convert=name.charAt(i);
            array[i]=convert;
        }
        return array;
    }
}
