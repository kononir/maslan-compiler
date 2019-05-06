package com.bsuir.maslan.lang.util;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class VariableStack {
    private int depth = -1;
    private List<LinkedHashMap<String, String>> hashMap = new LinkedList<>();
    private LinkedHashMap<String, String> totalHashMap = new LinkedHashMap<>();

    public void increase() {
        depth++;
        hashMap.add(new LinkedHashMap<>());
    }

    public void decrease() {
        depth--;
        for (String s : hashMap.get(depth + 1).keySet())
            totalHashMap.remove(s);
        hashMap.remove(depth + 1).clear();
    }

    public void put(String key, String value) {
        hashMap.get(depth).put(key, value);
        totalHashMap.put(key, value);
    }

    public String get(String key) {
        return totalHashMap.get(key);
    }
}
