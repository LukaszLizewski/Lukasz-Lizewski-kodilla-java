package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;
    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
    @Override
    public BigDecimal getCostOfPizza() {
        return pizzaOrder.getCostOfPizza();
    }
    @Override
    public String getDescriptionOfPizza() {
        return pizzaOrder.getDescriptionOfPizza();
    }
}
