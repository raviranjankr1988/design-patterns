package com.ravkumar.designpattern.abstractfactory;

public abstract class PizzaStore {

    public Pizza OrderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    abstract Pizza createPizza(String type);
}
