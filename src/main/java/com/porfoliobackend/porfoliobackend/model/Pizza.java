package com.porfoliobackend.porfoliobackend.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class Pizza {

    private String base;
    //a topping is a string. toppings are a list of strings
    private List topping = new ArrayList<String>();

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List getTopping() {
        return topping;
    }

    public void setTopping(List topping) {
        this.topping = topping;
    }
}
