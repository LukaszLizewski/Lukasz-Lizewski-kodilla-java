package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Start of all tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("End of all tests.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test no: "+testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape theCircle = new Circle();
        shapeCollector.addFigure(theCircle);
        Shape resultCircle = shapeCollector.shapes.get(0);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigure());
        Assert.assertEquals(theCircle, resultCircle);
    }
    @Test
    public void testRemovedFigure(){
        //Given
        Shape theTriangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(theTriangle);
        //When
        Shape theCircle = new Circle();
        shapeCollector.removeFigure(theCircle);
        Shape resultTriangle = shapeCollector.shapes.get(0);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigure());
        Assert.assertEquals(theTriangle, resultTriangle);
    }
}
