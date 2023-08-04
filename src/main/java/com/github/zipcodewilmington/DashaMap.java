package com.github.zipcodewilmington;

import com.github.zipcodewilmington.myLinkedList.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX{
    public MyLinkedList[] getDash() {
        return dash;
    }

    //Private vars
    protected MyLinkedList[] dash;
    protected String alphabet = "abcdefghijklmnopqrstuvwxyz";

    //Constructor
    public DashaMap()
    {
     dash = new MyLinkedList[26];

    for(int i =0; i<dash.length; i++)
    {
        dash[i] = new MyLinkedList(""+alphabet.charAt(i));
    }
    }

    @Override
    public void set(String key, Integer value)
    {

    }

    @Override
    public Integer delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
    return 0;
    }

    @Override
    public boolean isEmpty() {
        for(MyLinkedList all: dash)
        {
        if(!all.isEmpty())
        {
            return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        long totalSize =0;
        for(MyLinkedList all: dash)
        {
            totalSize+=all.size();
        }
        return totalSize;
    }

    /**
     * Returns the bucket corresponding to the key.
     * @param key
     * @return
     */

    @Override
    public int bucketSize(String key) {

        return dash[getBucketIndex(key)].size();
    }

    protected int getBucketIndex(String key)
    {
        return alphabet.indexOf(key);
    }


}
