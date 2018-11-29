package com.kodilla.stream;

import java.math.BigDecimal;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        World world = new World();

        world.addContinent(new Continent("Europe"));
        world.addContinent((new Continent("Asia")));


        Continent europe = new Continent("Europe");
        europe.addTheCountries(new Country("Poland", new BigDecimal("2222")));


        BigDecimal result = new BigDecimal("55555");
        Assert.assertEquals(result, world.getPeopleQuantity());
    }
}
