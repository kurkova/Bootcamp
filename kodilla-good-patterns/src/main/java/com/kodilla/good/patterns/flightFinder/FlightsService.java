package com.kodilla.good.patterns.flightFinder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsService {
    private FlightsDatabase flightsDatabase;

    public FlightsService(FlightsDatabase flightsDatabase) {
        this.flightsDatabase = flightsDatabase;
    }

    public Set<Flight> findFlightsFrom(String departureAirport) {
        return flightsDatabase.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightsTo(String arrivalAirport) {
        return flightsDatabase.getFlightsSet().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findDirectFlightsFromTo(String departureAirport, String arrivalAirport) {
        return flightsDatabase.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport) && flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> findConnectingFlightsFromTo(String departureAirport, String arrivalAirport) {
        Set<List<Flight>> availableFlights = new HashSet<>();

        flightsDatabase.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> {
                    List<Flight> temporary = flightsDatabase.getFlightsSet().stream()
                            .filter(flight1 -> flight.getArrivalAirport().equals(flight1.getDepartureAirport()) && flight1.getArrivalAirport().equals(arrivalAirport))
                            .collect(Collectors.toList());

                    if (temporary.size() > 0) {
                        List<Flight> flightsRoute = new ArrayList<>();
                        flightsRoute.add(flight);
                        flightsRoute.addAll(temporary);
                        availableFlights.add(flightsRoute);
                    }
                });
        return availableFlights;
    }
}



