package com.github.zipcodewilmington.myLinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void Testadd() {
        MyLinkedList list = new MyLinkedList("a");
        String expected = "brent";
        list.add(expected,3);
        String actual =list.head.getNext().data.getKey();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void TestSize()
    {
        MyLinkedList list = new MyLinkedList("a");
        list.add("b",3);
        Integer expected = 2;
        Integer actual = list.size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    void TestSize2()
    {
        MyLinkedList list = new MyLinkedList("a");
        list.add("b",3);
        list.add("b",3);
        list.add("b",3);
        list.add("b",3);
        list.add("b",3);
        list.add("b",3);
        list.add("b",3);
        list.add("b",3);
        list.add("b",3);


        Integer expected = 10;
        Integer actual = list.size();
        Assert.assertEquals(expected,actual);
    }


}