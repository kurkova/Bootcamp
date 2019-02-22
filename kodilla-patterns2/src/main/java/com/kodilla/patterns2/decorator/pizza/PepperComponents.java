package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperComponents extends PizzaDecorator {
    public PepperComponents(MakePizza makePizza) {
        super(makePizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getComponentsDescription() {
        return super.getComponentsDescription() + " + pepper";
    }
}
