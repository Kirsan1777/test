package service;

import nikita.even.service.EvenNumberService;
import nikita.month.service.MonthsService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.List;

public class EvenNumberTest {
    private static EvenNumberService even;

    @BeforeClass
    public static void setupStart() {
        even = new EvenNumberService();
    }

    @Test
    public void checkEvenNumber01(){
        List<Integer> list = Arrays.asList(1,2,3,4);
        boolean result = even.checkEvenNumber(list);
        Assert.assertTrue(result);
    }

    @Test
    public void checkEvenNumber02(){
        List<Integer> list = Arrays.asList(1,1,3,3);
        boolean result = even.checkEvenNumber(list);
        Assert.assertFalse(result);
    }

    @Test
    public void checkEvenNumber03(){
        List<Integer> list = Arrays.asList(2,2,2,2);
        boolean result = even.checkEvenNumber(list);
        Assert.assertTrue(result);
    }

    @Test
    public void checkEvenNumber04(){
        List<Integer> list = Arrays.asList(1,1,3,3);
        boolean result = even.checkEvenNumber(list);
        Assert.assertFalse(result);
    }
}
