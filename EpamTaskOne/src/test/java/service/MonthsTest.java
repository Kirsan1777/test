package service;

import nikita.month.service.MonthsService;
import nikita.perfect.service.PerfectNumberService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MonthsTest {
    private static MonthsService month;

    @BeforeClass
    public static void setupStart() {
        month = new MonthsService();
    }

    @Test
    public void checkDayInMonth01(){
        String nameMonth = "FEBRUARY";
        int year = 1344;
        int result = 29;
        Assert.assertEquals(result, month.calculateDays(nameMonth, year));
    }

    @Test
    public void checkDayInMonth02(){
        String nameMonth = "FEBRUARY";
        int year = 1344;
        int result = 28;
        Assert.assertNotEquals(result, month.calculateDays(nameMonth, year));
    }

    @Test
    public void checkDayInMonth03(){
        String nameMonth = "JUNE";
        int year = 1344;
        int result = 30;
        Assert.assertEquals(result, month.calculateDays(nameMonth, year));
    }

    @Test
    public void checkDayInMonth04(){
        String nameMonth = "JUNE";
        int year = 1344;
        int result = 32;
        Assert.assertNotEquals(result, month.calculateDays(nameMonth, year));
    }

    /*@Test(ExpectedException = IllegalArgumentException.class)
    public void checkDayInMonth05(){
        String nameMonth = "JUNE";
        int year = 1344;
        int result = 32;
        Assert.assertNotEquals(result, month.calculateDays(nameMonth, year));
    }*/

}
