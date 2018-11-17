package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> theCountries = new ArrayList<>();

    public void addTheCountries(Country country) {
        theCountries.add(country);
    }
}
