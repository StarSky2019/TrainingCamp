package com.itheima.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
        arraylist.add("中国");
        arraylist.add("美国");
        arraylist.add("日本");
        arraylist.add("法国");
        arraylist.add("英国");
        List<String> newarraylist = new ArrayList<>();
        System.out.println(arraylist);
        Random random = new Random();
        for(int j=3; j>=1; j--)
        {
            int index = random.nextInt(arraylist.size());
            newarraylist.add(arraylist.get(index));
            arraylist.remove(index);
        }
        System.out.println(newarraylist);
    }
}