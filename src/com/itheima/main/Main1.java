package com.itheima.main;

import java.util.*;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 使用2种符号分隔字符串，并放到数组中去
        List<String> list = new ArrayList<>();
        split(str, list);
        // 打印出来
        System.out.println(list);
    }

    public static void split(String s, List<String> l)
    {
        String[] array = s.split("[,&|]");
        for(int i=0; i<array.length; i++)
        {
            l.add(array[i]);
        }
    }
}