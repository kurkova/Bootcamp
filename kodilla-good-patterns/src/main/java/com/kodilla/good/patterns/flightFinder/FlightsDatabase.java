package com.kodilla.good.patterns.flightFinder;

import java.util.Set;

public class FlightsDatabase {
    private Set<Flight> flightsSet;

    public FlightsDatabase(Set<Flight> flightsSet) {
        this.flightsSet = flightsSet;
    }

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }
}
