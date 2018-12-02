package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        World world = new World();

        world.addContinent(new Continent("Europe"));

        Continent europe = new Continent("Europe");
        europe.addTheCountries(new Country("Poland", new BigDecimal("22222")));
        europe.addTheCountries(new Country("Scotland", new BigDecimal("55555")));

        BigDecimal result = new BigDecimal("77777");

        Assert.assertEquals(result,world.getPeopleQuantity());
    }

}
