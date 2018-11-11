package com.kodilla.testing.collection;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> inputNumbers = Arrays.asList();
        List<Integer> expextedOutputNumbers = Arrays.asList();
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        List<Integer> result = oddNumbers.exterminate(inputNumbers);
        Assert.assertEquals(expextedOutputNumbers, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> inputNumbers = Arrays.asList(2, 4, 5, 6, 7, 8, 9, 11);
        List<Integer> expextedOutputNumbers = Arrays.asList(2, 4, 6, 8);
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        List<Integer> result = oddNumbers.exterminate(inputNumbers);
        Assert.assertEquals(expextedOutputNumbers, result);
    }
}
