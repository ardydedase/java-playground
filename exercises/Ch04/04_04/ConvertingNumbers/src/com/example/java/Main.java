package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        // making a copy, not creating a reference
        // to the original value
        int intValue2 = intValue1;
        System.out.println("The 2nd value is: " + intValue2);

        // widening the type - is automatic
        long longValue1 = intValue1;

        System.out.println("The long value is: " + longValue1);

        short shortValue1 = (short) intValue1;

        System.out.println("The short value is: " + shortValue1);

        int intValue3 = 1024;
        // narrowing the type - at risk of losing data.
        byte byteValue = (byte) intValue3;

        System.out.println("The byte value is: " + byteValue);

        double doubleValue = 3.99999d;
        int intValue4 = (int) doubleValue;

        // value is truncated.
        System.out.println("Double to int: " + doubleValue);
    }

}
