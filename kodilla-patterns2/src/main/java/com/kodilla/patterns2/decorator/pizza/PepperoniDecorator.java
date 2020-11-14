package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniDecorator extends AbstractPizzaOrderDecorator {
    protected PepperoniDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCostOfPizza() {
        return super.getCostOfPizza().add(new BigDecimal(5));
    }
    @Override
    public String getDescriptionOfPizza() {
        return super.getDescriptionOfPizza() + " pepperoni;";
    }
}
