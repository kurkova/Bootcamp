package com.kodilla.stream.array;

        import org.junit.Assert;
        import org.junit.Test;

        import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class TestOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int[] numbers = {1, 4, 5, 6, 7, 8, 9, 3, 12, 18, 3, 21, 33, 45, 2, 65, 21, 89, 21, 9};

        double result = getAverage(numbers);

        Assert.assertEquals(19.1, result, 0.001);
    }
}


