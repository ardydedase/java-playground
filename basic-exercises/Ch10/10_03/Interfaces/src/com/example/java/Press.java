package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * Created by ardydedase on 24/2/17.
 */
public interface Press {
    public int getOil(List<Olive> olives);
    public void setOil(int oil);
}
