package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaDecorator implements MakePizza {
    private final MakePizza makePizza;

    protected PizzaDecorator(MakePizza makePizza){
        this.makePizza = makePizza;
    }

    @Override
    public BigDecimal getCost(){
        return makePizza.getCost();
    }

    @Override
    public String getComponentsDescription(){
        return makePizza.getComponentsDescription();
    }
}
