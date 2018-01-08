package com.ravkumar.designpattern.factory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.OrderPizza("cheese");
        System.out.println("Ethen Ordered a " + pizza.getName());

        Pizza cPizza = chicagoStore.OrderPizza("cheese");
        System.out.println("Joel Ordered a " + pizza.getName());
    }
}
