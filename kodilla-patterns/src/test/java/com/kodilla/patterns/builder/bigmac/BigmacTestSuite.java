package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac (){
        //Given
        Bigmac newBigmac = new Bigmac.BigmacBuilder()
                        .setBun("graham")
                        .setSauce("spicy")
                        .setBurgers(4)
                        .setIngredients("onion")
                        .setIngredients("cheese")
                        .setIngredients("ketchup")
                        .setIngredients("olive")
                        .build();
        System.out.println(newBigmac);
        //When
        int howManyIngredients = newBigmac.getIngredients().size();
        int howManyBurgers = newBigmac.getBurgers();
        String whatBun = newBigmac.getBun();
        //Then
        Assert.assertEquals(4,howManyIngredients);
        Assert.assertEquals(4,howManyBurgers);
        Assert.assertEquals("graham",whatBun);
    }
}
