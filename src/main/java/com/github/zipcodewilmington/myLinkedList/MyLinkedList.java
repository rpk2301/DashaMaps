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
    while(CurrentNode.getNext()!=null)
    {
        CurrentNode = CurrentNode.getNext();
    }
    CurrentNode.setNext(new MyNode(key,value));
    }


    public Integer size()
    {
        Integer count = 0;
        MyNode CurrentNode = head;
        while(CurrentNode.getNext()!=null)
        {
            CurrentNode = CurrentNode.getNext();
            count++;
        }
        return count;
    }
    public boolean isEmpty()
    {
        if (head.getNext()==null)return true; else return false;
    }

    public MyNode get(String key) {
        MyNode CurrentNode = head;
        while (CurrentNode != null) {
            if (CurrentNode.getData().getKey().equals(key)) {
                return CurrentNode;
            }
            CurrentNode = CurrentNode.getNext();
        }
        return null;
    }



    public Integer remove (String key) {
        MyNode previousNode = head;
        MyNode CurrentNode = head.getNext();
        while (CurrentNode != null && !CurrentNode.getData().getKey().equals(key))
        {
            previousNode = CurrentNode;
            CurrentNode = CurrentNode.getNext();
        }
        if(CurrentNode == null)
        {
            return null;
        }
        previousNode.setNext(CurrentNode.getNext());
        return CurrentNode.getData().getValue();

    }


}
