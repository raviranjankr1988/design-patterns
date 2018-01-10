package com.ravkumar.designpattern.templatemethod.withhook;

public abstract class CaffeinBeverage {
    final void prepareRecipe() {

        boilWater();

        brew();

        pourInCup();

        if(customerWantsCondiments()) {

            addCondiments();
        }

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring beverage in cup");
    }


    //hook - subclass can override this function or can ignore
    boolean customerWantsCondiments() {
        return true;
    }

}
