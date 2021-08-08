package com.itheima.main;

import java.util.*;

public class Main2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(",");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++)
        {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        //
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(-1);
    }
}