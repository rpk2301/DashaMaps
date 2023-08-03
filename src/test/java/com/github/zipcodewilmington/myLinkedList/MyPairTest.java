package com.github.zipcodewilmington.myLinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void setValue()
    {
        MyPair pair = new MyPair("no",3);
        Integer expectedVal = 43;
        pair.setValue(expectedVal);
        Integer actualVal = pair.getValue();
        Assert.assertEquals(expectedVal,actualVal);
    }

    @Test
    void testSetKey()
    {
        MyPair pair = new MyPair("no",3);
        String expectedKey = "JoeHuntenberg";
        pair.setKey(expectedKey);
        String actualKey = pair.getKey();
        Assert.assertEquals(expectedKey,actualKey);


    }

    @Test
    void testEquals() {

        MyPair myair = new MyPair("no",1);
        MyPair mypair = new MyPair("no",1);

        Assert.assertEquals(myair,mypair);



    }
}