package com.java.Factorial;
import java.util.Scanner;

public class FactorialObject {
    Scanner scanner=new Scanner(System.in);
    private int number=scanner.nextInt();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
