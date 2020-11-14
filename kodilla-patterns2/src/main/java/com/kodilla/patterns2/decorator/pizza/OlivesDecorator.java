package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivesDecorator extends AbstractPizzaOrderDecorator {
    public OlivesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCostOfPizza() {
        return super.getCostOfPizza().add(new BigDecimal(2));
    }
    @Override
    public String getDescriptionOfPizza() {
        return super.getDescriptionOfPizza()+ " olives;";
    }
}
