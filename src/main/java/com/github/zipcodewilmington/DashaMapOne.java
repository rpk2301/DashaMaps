package com.github.zipcodewilmington;

import com.github.zipcodewilmington.myLinkedList.MyNode;

public class DashaMapOne extends DashaMap {


    public DashaMapOne()
    {
        super();
    }


    private String HashFunctionOne(String input)
    {
        if (input.length() > 0) {
            return String.valueOf(Character.toLowerCase(input.charAt(0)));
        }
        return null;
    }

    @Override
    public Integer delete(String key) {
        String keyHas = HashFunctionOne(key);
        int keyHashIndex = getBucketIndex(keyHas);
        return dash[keyHashIndex].remove(key);
    }

    @Override
    public void set(String key, Integer value) {
        String keyHash = HashFunctionOne(key);
        int keyHashIndex = getBucketIndex(keyHash);
        dash[keyHashIndex].add(key,value);
    }

    @Override
    public Integer get(String key) {
        String keyHash = HashFunctionOne(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = dash[keyHashIndex].get(key);
        return result.getData().getValue();
    }
}
