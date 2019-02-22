package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MakePizzaTestSuite {
    MakePizza thePizza = new BasicPizza();

    @Test
    public void testBasicPizzaGetCost(){
        //Given
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaGetComponent(){
        //Given
        //Then
        String componentsDescription = thePizza.getComponentsDescription();
        //Then
        assertEquals("Components: dough + tomato sos + cheese", componentsDescription);
    }

    @Test
    public void testMushroomComponentGetCost(){
        //Given
        thePizza = new MushroomComponent(thePizza);
        //Then
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testMushroomComponentGetComponentDescription(){
        //Given
        thePizza = new MushroomComponent(thePizza);
        //Then
        String componentsDescription = thePizza.getComponentsDescription();
        //Then
        assertEquals("Components: dough + tomato sos + cheese + mushroom", componentsDescription);
    }

    @Test
    public void testAllPizzaComponentsGetCost(){
        //Given
        thePizza = new MushroomComponent(thePizza);
        thePizza = new PepperComponents(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(24), theCost);
    }

    @Test
    public void testAllPizzaComponentsGetComponentsDescription(){
        //Given
        thePizza = new MushroomComponent(thePizza);
        thePizza = new PepperComponents(thePizza);
        //When
        String componentsDescription = thePizza.getComponentsDescription();
        //Then
        assertEquals("Components: dough + tomato sos + cheese + mushroom + pepper", componentsDescription);
    }
}
