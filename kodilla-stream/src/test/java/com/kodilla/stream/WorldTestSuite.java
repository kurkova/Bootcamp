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

        world.addContinent(new Continent(new Country("Poland", new BigDecimal("22222")));
        world.addContinent(new Continent(new Country("Scotland", new BigDecimal("33333")));

        BigDecimal result = new BigDecimal("55555");
        Assert.assertEquals(result, world.getPeopleQuantity());
    }
}
