package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("normal")
                .burgers(3)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String kindOfBun = bigmac.getBun();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals("normal", kindOfBun);
    }
}
