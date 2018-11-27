package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final Country country;
    private final List<Country> theCountriesList = new ArrayList<>();

    public Continent(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void addTheCountries(Country country) {
        theCountriesList.add(country);
    }

    public List<Country> getTheCountriesList() {
        return theCountriesList;
    }


}
