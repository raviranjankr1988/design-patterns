package com.ravkumar.designpattern.templatemethod.withouthook;

public class Coffee extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
