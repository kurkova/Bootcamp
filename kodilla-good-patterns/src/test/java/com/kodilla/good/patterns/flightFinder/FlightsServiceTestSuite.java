package com.kodilla.good.patterns.flightFinder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightsServiceTestSuite {
    private HashSet<Flight> flightsSet = new HashSet<>();
    private FlightsService flightsService;
    private FlightsDatabase flightsDatabaseMock;
    private  String departureAirport = "Warsaw";
    private String arrivalAirport = "Krakow";

    @Before
    public void before(){
        flightsDatabaseMock = mock(FlightsDatabase.class);
        flightsService = new FlightsService(flightsDatabaseMock);
        flightsSet.add(new Flight("Warsaw", "Krakow"));
        flightsSet.add(new Flight("Warsaw", "Gdansk"));
        flightsSet.add(new Flight("Gdansk", "Krakow"));
    }

    @Test
    public void testFindFlightFrom(){
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("Warsaw", "Krakow"));
        expected.add(new Flight("Warsaw", "Gdansk"));
        when(flightsDatabaseMock.getFlights()).thenReturn(flightsSet);
        Set<Flight> result = flightsService.findFlightsFrom(departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindFlightsTo(){
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("Warsaw", "Krakow"));
        expected.add(new Flight("Gdansk", "Krakow"));
        when(flightsDatabaseMock.getFlights()).thenReturn(flightsSet);
        Set<Flight> result = flightsService.findFlightsTo(arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }
}
