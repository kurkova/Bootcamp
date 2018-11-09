package com.kodilla.testing.collection;
import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> inputNumbers = new ArrayList<Integer>();
        ArrayList<Integer> expextedOutputNumbers = new ArrayList<Integer>();
        inputNumbers.addAll(Arrays.asList());
        expextedOutputNumbers.addAll(Arrays.asList());
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        ArrayList<Integer> result = oddNumbers.exterminate(inputNumbers);
        Assert.assertEquals(expextedOutputNumbers, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> inputNumbers = new ArrayList<Integer>();
        ArrayList<Integer> expextedOutputNumbers = new ArrayList<Integer>();
        inputNumbers.addAll(Arrays.asList(2,4,5,6,7,8,9,11));
        expextedOutputNumbers.addAll(Arrays.asList(2,4,6,8));
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        ArrayList<Integer> result = oddNumbers.exterminate(inputNumbers);
        Assert.assertEquals(expextedOutputNumbers, result);
    }

}
