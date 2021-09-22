package com.itheima.main;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        String[] str = Integer.toBinaryString(n).split("");
        System.out.println(Arrays.toString(str));
        for(String s : str)
        {
            if(s.equals("1"))
                res++;
        }
        System.out.println(res);
    }
}