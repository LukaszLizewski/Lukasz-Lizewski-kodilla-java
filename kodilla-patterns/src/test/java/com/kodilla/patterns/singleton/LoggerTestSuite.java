package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
//    private static Logger logger;

    @BeforeClass
    public static void createLogger(){
        Logger.getInstance().log("first log in");
        Logger.getInstance().log("second log in");
        Logger.getInstance().log("third log in");
    }
    @AfterClass
    public static void endOfTests() {
        System.out.println("End Of all tests (this sout has written for fun)");
    }
    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log in: " + lastLog);
        //Then
        Assert.assertEquals("third log in", lastLog);
    }
}
