package com.github.zipcodewilmington.myLinkedList;

public class MyLinkedList {



    MyNode head;

    public MyLinkedList(String key)
    {
        head = new MyNode(key,null);
    }

    public MyNode getHead()
    {
        return head;
    }

    public void add(String key, Integer value)
    {
    MyNode CurrentNode = head;
    while(CurrentNode.next!=null)
    {
        CurrentNode = CurrentNode.getNext();
    }
    CurrentNode.setNext(new MyNode(key,value));
    }


    public Integer size()
    {
        Integer count = 1;
        MyNode CurrentNode = head;
        while(CurrentNode.next!=null)
        {
            CurrentNode = CurrentNode.getNext();
            count++;
        }
        return count;
    }


}
