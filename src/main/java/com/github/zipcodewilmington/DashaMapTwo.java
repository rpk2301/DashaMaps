package com.github.zipcodewilmington;

import com.github.zipcodewilmington.myLinkedList.MyNode;

public class DashaMapTwo extends DashaMap {

    public DashaMapTwo()
    {
        super();
    }


    private String HashFunctionTwo(String input)
    {
        if (input.length() > 0) {
            return String.valueOf(Character.toLowerCase(input.charAt(1)));
        }
        return null;
    }

    @Override
    public Integer delete(String key) {
        String keyHas = HashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHas);
        return dash[keyHashIndex].remove(key);
    }

    @Override
    public void set(String key, Integer value) {
        String keyHash = HashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        dash[keyHashIndex].add(key,value);
    }

    @Override
    public Integer get(String key) {
        String keyHash = HashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = dash[keyHashIndex].get(key);
        return result.getData().getValue();
    }
}
