package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        // Use double to get the exact value.
        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        double result5 = intValue1 % intValue2;
        System.out.println("Remainder: " + result5);

        // get the rounded value
        double doubleValue = -3.999999;
        long rounded = Math.round(doubleValue);

        // rounded to the nearest integer value
        System.out.println(rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println(absValue);
    }

}
