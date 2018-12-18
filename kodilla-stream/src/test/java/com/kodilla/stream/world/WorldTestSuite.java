package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.addTheCountry(new Country("Poland", new BigDecimal("22222")));
        europe.addTheCountry(new Country("Scotland", new BigDecimal("55555")));
        Continent asia = new Continent("Asia");
        asia.addTheCountry(new Country("Hong Kong", new BigDecimal("22222")));
        asia.addTheCountry(new Country("Macau", new BigDecimal("11111")));
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        //When
        BigDecimal result = new BigDecimal("111110");
        //Then
        Assert.assertEquals(result, world.getPeopleQuantity());
    }
}
