package com.example.java;

public class Main {

    public static void main(String[] args) {

        String s = null;

        System.out.println(s);

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        // throws an exception if there's no '- 1'. out of bounds
        char lastChar = chars[chars.length - 1];
        System.out.println(lastChar);
    }

}
