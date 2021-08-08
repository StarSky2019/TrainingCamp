package com.itheima.main;

import java.util.*;

public class Main1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(3);
        // 快速排序
        QuickSort(list, 0, list.size() - 1);
        System.out.println(list);
    }

    public static void QuickSort(List<Integer> list, int left, int right)
    {
        // 递归终止条件
        if(left == right)
            return;
        int base = list.get(left);
        while(left < right)
        {
            while(list.get(left) < base)
                left++;
            while(list.get(right) > base)
                right--;
            int tmp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, tmp);
        }
        list.set(left, base);
        QuickSort(list, left, base);
        QuickSort(list, base, right);
    }
}