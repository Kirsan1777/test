package service;

import nikita.coordinate.service.CoordinateService;
import nikita.even.service.EvenNumberService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CoordinateTest {

    private static CoordinateService coordinate;

    @BeforeClass
    public static void setupStart() {
        coordinate = new CoordinateService();
    }

    @Test
    public void checkEvenNumber01(){
        //result
        //Assert.assertEquals(result);
    }
}
