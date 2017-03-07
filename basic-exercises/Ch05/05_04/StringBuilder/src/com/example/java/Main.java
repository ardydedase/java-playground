package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb2);

        // collect data from the console.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");

        // waits for the user to enter any value
        // and press enter
        String input = scanner.nextLine();

        System.out.println(input);

        // combine StringBuilder and scanner.

        // delete existing contents of sb for now.
        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        // when you print sb, toString() is automatically called.
        // there's no need to explicitly call toString() here.
        System.out.println(sb);
    }

}
