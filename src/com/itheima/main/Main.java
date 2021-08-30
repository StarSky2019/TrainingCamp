package com.itheima.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        // split to words by space
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; --i) {
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}