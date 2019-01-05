package com.kodilla.good.patterns.flightFinder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightsServiceTestSuite {
    private HashSet<Flight> flightsSet = new HashSet<>();
    private FlightsService flightsService;
    private FlightsDatabase flightsDatabaseMock;
    private String departureAirport;
    private String arrivalAirport;

    @Before
    public void before() {
        departureAirport = "Warsaw";
        arrivalAirport = "Krakow";
        flightsDatabaseMock = mock(FlightsDatabase.class);
        flightsService = new FlightsService(flightsDatabaseMock);
        flightsSet.add(new Flight("Warsaw", "Krakow"));
        flightsSet.add(new Flight("Warsaw", "Gdansk"));
        flightsSet.add(new Flight("Gdansk", "Krakow"));
    }

    @Test
    public void testFindFlightFrom() {
        //Given
        //When
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("Warsaw", "Krakow"));
        expected.add(new Flight("Warsaw", "Gdansk"));
        when(flightsDatabaseMock.getFlightsSet()).thenReturn(flightsSet);
        Set<Flight> result = flightsService.findFlightsFrom(departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindFlightsTo() {
        //Given
        //When
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("Warsaw", "Krakow"));
        expected.add(new Flight("Gdansk", "Krakow"));
        when(flightsDatabaseMock.getFlightsSet()).thenReturn(flightsSet);
        Set<Flight> result = flightsService.findFlightsTo(arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindDirectFlightsFromTo() {
        //Given
        //When
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("Warsaw", "Krakow"));
        when(flightsDatabaseMock.getFlightsSet()).thenReturn(flightsSet);
        Set<Flight> result = flightsService.findDirectFlightsFromTo(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindConnectingFlightsFromTo() {
        //Given
        //When
        List<Flight> flights = new ArrayList<>();
        //flights.add(new Flight("Warsaw","Krakow"));
        flights.add(new Flight("Warsaw", "Gdansk"));
        flights.add(new Flight("Gdansk", "Krakow"));
        Set<List<Flight>> expected = new HashSet<>();
        expected.add(flights);
        when(flightsDatabaseMock.getFlightsSet()).thenReturn(flightsSet);
        Set<List<Flight>> result = flightsService.findConnectingFlightsFromTo(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }
}
