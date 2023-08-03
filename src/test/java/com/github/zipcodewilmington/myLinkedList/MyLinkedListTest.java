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
        String actual =list.head.getNext().getData().getKey();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void TestSize()
    {
        MyLinkedList list = new MyLinkedList("a");
        list.add("b",3);
        Integer expected = 1;
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


        Integer expected = 9;
        Integer actual = list.size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    void testget()
    {
        MyLinkedList list = new MyLinkedList("f");
        MyNode actual = list.head;
        MyNode expected = list.get("f");
        Assert.assertEquals(expected,actual);
    }

    @Test
    void isEmptyTest()
    {
        MyLinkedList list = new MyLinkedList("Manny");
        list.add("Bob",3);
        Assert.assertFalse(list.isEmpty());
    }


    @Test
    void TestRemove()
    {



    }




}