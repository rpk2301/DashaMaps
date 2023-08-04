package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {

    @Test
    public void isEmptyTest()
    {
        DashaMap dash = new DashaMapOne();
        boolean actual = dash.isEmpty();
        Assert.assertEquals(true,actual);
    }


    @Test
    public void isNotEmpty()
    {
        DashaMap dash = new DashaMapOne();
        boolean actual = dash.isEmpty();
        Assert.assertEquals(true,actual);
    }





    @Test
    public void sizeEmptyTest()
    {

        long expected = 0;
        DashaMap dash = new DashaMapOne();
        long actual = dash.size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void AddToLinkedList()
    {


        DashaMap dash = new DashaMapOne();
        dash.getDash()[0].add("efgev",3);
        Long actual = dash.size();
        Long expected = 1L;
        Assert.assertEquals(actual,expected);

    }



    @Test
    public void set()
    {
        long expectedSize = 1;
        String expectKey = "Brent";
        Integer expectedValue = 91;
        DashaMapOne one = new DashaMapOne();
        one.set(expectKey,expectedValue);
        Assert.assertEquals(expectedSize,one.bucketSize("b"));
    }

}
