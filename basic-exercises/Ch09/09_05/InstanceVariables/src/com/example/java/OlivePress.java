package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * Created by ardydedase on 20/2/17.
 */
public class OlivePress {
    public int getOil(List<Olive> olives) {
        for (Olive o: olives) {
            System.out.println(o.name);
        }
        return 0;
    }
}
