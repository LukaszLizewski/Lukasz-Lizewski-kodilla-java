package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World("Earth");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country spain = new Country("Spain", new BigDecimal("68000000"));
        Country italy = new Country("Italy", new BigDecimal("87000000"));
        Country greatBritain = new Country("Great Britain", new BigDecimal("89000000"));
        Country rpa = new Country("RPA", new BigDecimal("120000000"));
        Country botswana = new Country("Botswana", new BigDecimal("98000000"));
        Country congo = new Country("Congo", new BigDecimal("69000000"));
        Country thailand = new Country("Thailand", new BigDecimal("145000000"));
        Country japan = new Country("Japan", new BigDecimal("250000000"));
        Country singapore = new Country("singapore", new BigDecimal("17000000"));
        Country usa = new Country("USA", new BigDecimal("380000000"));
        Country canada = new Country("Canada", new BigDecimal("260000000"));
        Country mexico = new Country("Mexico", new BigDecimal("432000000"));
        Country brazil = new Country("Brazil", new BigDecimal("542000000"));
        Country venezuela = new Country("Venezuela", new BigDecimal("90000000"));
        Country chile = new Country("Chile", new BigDecimal("34000000"));
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        europe.addCountry(poland);
        europe.addCountry(greatBritain);
        europe.addCountry(italy);
        europe.addCountry(spain);
        africa.addCountry(rpa);
        africa.addCountry(botswana);
        africa.addCountry(congo);
        asia.addCountry(thailand);
        asia.addCountry(japan);
        asia.addCountry(singapore);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(venezuela);
        southAmerica.addCountry(chile);
        //When
        BigDecimal resultTotal = world.getPeopleQuantity();
        //Then
        BigDecimal expectedTotal = new BigDecimal("2721000000");
        Assert.assertEquals(expectedTotal,resultTotal);
    }
}
