package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            if (bun.equals("normal") || bun.equals("sesame")) {
                return this;
            }
            throw new IllegalStateException("Optional bun: normal or sesame");
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            if (sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue")) {
                return this;
            }
            throw new IllegalStateException("Optional sauce: standard, 1000 islands, barbecue");
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            if (ingredient.equals("lettuce") || ingredient.equals("onion") || ingredient.equals("bacon") || ingredient.equals("cucumber")
                    || ingredient.equals("chilli") || ingredient.equals("mushroom") || ingredient.equals("prawn") || ingredient.equals("cheese")) {
                return this;
            }
            throw new IllegalStateException("Optional ingredient: onion, bacon, cucumber,mushroom, prawn, cheese");
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(final String bun, final int burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);

    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", souce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}




