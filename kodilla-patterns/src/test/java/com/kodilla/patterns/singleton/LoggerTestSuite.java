package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Open programme");
        Logger.getInstance().log("Close programme");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Close programme", lastLog);
    }
}
