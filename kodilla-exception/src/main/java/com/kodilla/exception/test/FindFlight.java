package com.kodilla.exception.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("London", true);
        airports.put("Poznan", false);
        airports.put("Warsaw", false);

        if (airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport()).equals(true) && airports.get(flight.getArrivalAirport()).equals(true)) {
            System.out.println("Your flight is possible");
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        Flight flight = new Flight("London", "Warsaw");
        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, Your flight is impossible");
        }
    }
}
