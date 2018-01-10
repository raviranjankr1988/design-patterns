package com.ravkumar.designpattern.templatemethod.withhook;

public class CaffeinBeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

    }
}
