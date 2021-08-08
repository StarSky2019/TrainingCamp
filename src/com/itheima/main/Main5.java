package com.itheima.main;

import java.util.Scanner;
import java.util.Stack;

public class Main5 {
    public static void main(String[] args) {
        // 输入任意一个十进制数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int num = sc.nextInt();
        // 处理特殊情况
        if(num == 0)
            System.out.println(0);
        // 存储十进制数
        Stack<Integer> stack = new Stack<>();
        // 进行转换
        while(num != 0)
        {
            int i = num % 2;
            num = num / 2;
            stack.push(i);
        }
        // 输出结果
        String res = "";
        while(!stack.empty())
        {
            int u = stack.pop();
            res += u;
        }
        System.out.println("转换为二进制结果为：");
        System.out.println(res);
    }
}
