package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("standard")
                .burgers(3)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("bacon")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String kindOfBun = bigmac.getBun();
        int quantityBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals("standard", kindOfBun);
        Assert.assertEquals(3, quantityBurgers);
    }
    @Test
    public void testBigmacException() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("wheat")
                .burgers(3)
                .sauce("standard")
                .ingredient("onion")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String kindOfBun = bigmac.getBun();
        int quantityBurgers = bigmac.getBurgers();

        //Then
        try{
            Assert.assertEquals(2, howManyIngredients);
            Assert.assertEquals("standard", kindOfBun);
            Assert.assertEquals(3, quantityBurgers);
        }catch(IllegalStateException e){
        }
    }
}
