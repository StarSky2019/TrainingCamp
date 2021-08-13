package com.itheima.main;

import java.util.Scanner;
import java.util.Stack;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] array = str.replace("\"", "").toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<array.length; i++)
        {
            if(array[i] == '[')
                stack.push(']');
            else if(array[i] == '{')
                stack.push('}');
            else if(array[i] == '(')
                stack.push(')');
            else if(stack.isEmpty() || array[i] != stack.pop())
            {
                System.out.println(false);
                return;
            }
        }
        if(stack.isEmpty())
        {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}