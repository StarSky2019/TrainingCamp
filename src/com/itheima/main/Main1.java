package com.itheima.main;

import java.util.*;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String new_str = str.substring(1, n-1);
        System.out.println(new_str);
        System.out.println(Integer.parseInt(new_str));
        System.out.println();
    }
}