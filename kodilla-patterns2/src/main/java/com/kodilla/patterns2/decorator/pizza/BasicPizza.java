package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements MakePizza {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(15.0);
    }

    @Override
    public String getComponentsDescription(){
        return "Components: dough + tomato sos + cheese";
    }
}
