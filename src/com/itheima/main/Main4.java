package com.itheima.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNext())
        {
            int num = sc.nextInt();
            arrayList.add(num);
        }
        System.out.println(arrayList);
    }
}
