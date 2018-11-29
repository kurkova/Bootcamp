package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final String nameContinent;
    private final List<Country> theCountriesList = new ArrayList<>();

    public Continent(final String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void addTheCountries(Country country) {
        theCountriesList.add(country);
    }

    public List<Country> getTheCountriesList() {
        return theCountriesList;
    }


}
