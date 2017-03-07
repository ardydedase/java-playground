package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // set the size for a more efficient allocation of memory
        List<String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        // toString method is automatically called in the object
        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The second state is " + state);

        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " + pos);
    }

}
