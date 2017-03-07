package com.example.java.model;

/**
 * Created by ardydedase on 20/2/17.
 */
public enum OliveName {
    // once you decide to add another value later on,
    // it occurs in only one place.
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
