package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator{
    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCostOfPizza() {
        return super.getCostOfPizza().add(new BigDecimal(3));
    }
    @Override
    public String getDescriptionOfPizza() {
        return super.getDescriptionOfPizza() + " extra cheese;";
    }
}
