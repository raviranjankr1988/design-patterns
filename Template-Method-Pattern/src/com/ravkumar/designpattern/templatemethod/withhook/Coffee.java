package com.ravkumar.designpattern.templatemethod.withhook;

import java.util.Scanner;

public class Coffee extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments(){
        String answer = getUserInput();

        if(answer.toLowerCase().equals("y")) {
            return true;
        } else {
            return false;
        }

    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        Scanner scanner = new Scanner(System.in);

        answer = scanner.next();

        return answer;
    }
}
