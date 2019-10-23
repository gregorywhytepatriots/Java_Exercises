package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000 + (10 * (myByte + myShort + myInt));
        System.out.println(myLong);

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);
        calculateScore();
    }

    public static void calculateScore() {
        System.out.println("HelloWorld");
        
    }
}
