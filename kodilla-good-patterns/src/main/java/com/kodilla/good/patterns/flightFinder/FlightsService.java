package com.kodilla.good.patterns.flightFinder;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsService {
    private FlightsDatabase flightsDatabase;

    public FlightsService(FlightsDatabase flightsDatabase) {
        this.flightsDatabase = flightsDatabase;
    }

    public Set<Flight> findFlightsFrom(String departureAirport){
        return flightsDatabase.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightsTo(String arrivalAirport){
        return flightsDatabase.getFlightsSet().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }
    public Set<Flight> findAllFlightsFromTo(String departureAirport, String arrivalAirport){
        return flightsDatabase.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }
}

