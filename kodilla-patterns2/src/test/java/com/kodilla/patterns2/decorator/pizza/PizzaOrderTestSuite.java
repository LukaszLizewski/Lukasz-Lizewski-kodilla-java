package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOlivesGetCost () {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCostOfPizza();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }
    @Test
    public void testPizzaOlivesGetDescription () {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescriptionOfPizza();
        //Then
        assertEquals("Base: pizza dough, tomato sauce with cheese, accessories: olives;"
                ,theDescription);
    }
    @Test
    public void testPizzaOlivesExtraCheeseGetCost () {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCostOfPizza();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }
    @Test
    public void testPizzaOlivesExtraCheeseGetDescription () {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescriptionOfPizza();
        //Then
        assertEquals("Base: pizza dough, tomato sauce with cheese, accessories: olives; extra cheese;"
                ,theDescription);
    }
    @Test
    public void testPizzaOlivesExtraCheeseOnionPepperoniSalamiGetCost () {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCostOfPizza();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }
    @Test
    public void testPizzaOlivesExtraCheeseOnionPepperoniSalamiGetDescription () {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescriptionOfPizza();
        //Then
        assertEquals("Base: pizza dough, tomato sauce with cheese, accessories: olives; extra cheese; onion; pepperoni; salami;"
                ,theDescription);
    }
}
