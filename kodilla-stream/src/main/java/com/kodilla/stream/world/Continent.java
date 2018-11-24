package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final Country country;

    public Continent(Country country) {
        this.country = country;
    }

    private final List<Country> theCountriesList = new ArrayList<>();

    public List<Country> getTheCountry() {
        return theCountriesList;
    }

    public void addTheCountries(Country country) {
        theCountriesList.add(country);
    }
}
