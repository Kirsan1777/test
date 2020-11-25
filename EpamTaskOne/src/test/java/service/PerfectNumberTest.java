package service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import nikita.perfect.service.PerfectNumberService;

public class PerfectNumberTest {

    private static PerfectNumberService number;

    @BeforeClass
    public static void setupStart() {
        number = new PerfectNumberService();
    }

    @Test
    public void checkPerfectNumber01(){
        int x = 6;
        boolean result = true;
        Assert.assertEquals(result, number.checkPerfectNumber(x));
    }

    @Test
    public void checkPerfectNumber02(){
        int x = 10;
        boolean result = true;
        Assert.assertNotEquals(result, number.checkPerfectNumber(x));
    }

    @Test
    public void checkPerfectNumber03(){
        int x = 10;
        boolean result =  number.checkPerfectNumber(x);
        Assert.assertFalse(result);
    }

    @Test
    public void checkPerfectNumber04(){
        int x = 6;
        boolean result = number.checkPerfectNumber(x);
        Assert.assertTrue(result);
    }

}
