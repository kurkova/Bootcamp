package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomComponent extends PizzaDecorator {
    public MushroomComponent(MakePizza makePizza) {
        super(makePizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getComponentsDescription() {
        return super.getComponentsDescription() + " + mushroom";
    }
}
