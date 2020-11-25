package service;

import nikita.square.service.SquareInCircleService;
import nikita.square.service.SquareNumberService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SquareTest {

    private static SquareInCircleService square;
    private static SquareNumberService squareNumber;

    @BeforeClass
    public static void setup(){
        square = new SquareInCircleService();
    }

    @BeforeClass
    public static void setupStart(){
        squareNumber = new SquareNumberService();
    }

    @Test
    public void calculateSquare01(){
        int s = 16;
        double result = 2;
        Assert.assertEquals(result, square.calculateTheDifference(s), 0.0000001);
    }


    @Test
    public void calculateSquare02(){
        int s = -16;
        double result = 2;
        Assert.assertEquals(result, square.calculateTheDifference(s), 0.0000001);
    }

    @Test
    public void calculateSquare03(){
        int x = 16;
        double result = 36;
        Assert.assertEquals(result, squareNumber.calculateSquareLastNumber(x), 0.000001);
    }

    @Test
    public void calculateSquare04(){
        int x = -16;
        double result = 36;
        Assert.assertEquals(result, squareNumber.calculateSquareLastNumber(x), 0.000001);
    }
}
