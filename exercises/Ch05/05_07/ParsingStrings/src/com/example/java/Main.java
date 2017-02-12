package com.example.java;

public class Main {

    public static void main(String[] args) {

        String s1 = "Welcome to California!";
        System.out.println("Length of string: " + s1.length());

        // get the position of string
        int position = s1.indexOf("California");
        System.out.println("Position of substring: " + position);

        // print substring from specified position
        String sub = s1.substring(11);
        System.out.println(sub);

        // get length of string
        String s2 = "Welcome!           ";
        int len1 = s2.length();
        System.out.println(len1);
        // trim method removes spaces
        String s3 = s2.trim();
        System.out.println(s3.length());
    }

}
