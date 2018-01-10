package com.ravkumar.designpattern.templatemethod.withhook;

public class Tea extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
