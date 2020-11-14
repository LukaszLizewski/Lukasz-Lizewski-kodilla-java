package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCostOfPizza() {
        return new BigDecimal(15);
    }
    @Override
    public String getDescriptionOfPizza() {
        return "Base: pizza dough, tomato sauce with cheese, accessories:";
    }
}
