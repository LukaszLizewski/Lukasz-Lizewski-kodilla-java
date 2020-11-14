package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {
    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCostOfPizza() {
        return super.getCostOfPizza().add(new BigDecimal(4));
    }
    @Override
    public String getDescriptionOfPizza() {
        return super.getDescriptionOfPizza() + " salami;";
    }
}
