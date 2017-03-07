package com.example.java;

public class Main {

    public static void main(String[] args) {
        // Java distinguishes between characters and strings.
        // String is a complex object and can contain many characters
        // chars are single quotes, strings are double quotes
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        char dollarSign = '\u0024';
        System.out.println(dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        // char is a primitive value
    }

}
