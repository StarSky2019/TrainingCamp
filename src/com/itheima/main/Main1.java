package com.itheima.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 技术点1：去输入的字符串双引号
        str = str.replace("\"", "");
        Map<String, Integer> map = new HashMap<>();
        // 技术点2：使用map保存数据
        map.put("lower", 0);
        map.put("upper", 0);
        map.put("number", 0);
        map.put("other", 0);
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                map.put("lower", map.get("lower") + 1);
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                map.put("upper", map.get("upper") + 1);
            }
            else if(ch >= '0' && ch <= '9')
            {
                map.put("number", map.get("number") + 1);
            }
            else
            {
                map.put("other", map.get("other") + 1);
            }
        }
        // 技术点3：遍历打印hashmap
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}