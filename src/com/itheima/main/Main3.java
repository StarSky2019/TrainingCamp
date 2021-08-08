package com.itheima.main;//package Test;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String s = "abcabcdeabcd";
        System.out.println(getLengthchar(s));
    }

    public static String getLengthchar(String s){
        String str1 = "";
        String str2 = "";
        for(int i=0; i<s.length(); i++){
            if(str1.equals(""))
            {
                str1 += s.charAt(i);
            }
            // 字符比较到了末尾，跳出循环
            if(i+1 == s.length())
            {
                break;
            }
            // 比较该字符和它的下一个字符是否为递增
            if((s.charAt(i) + 1) == s.charAt(i+1))
            {
                str1 += s.charAt(i+1);
            }
            // 当前字符和它的下一个字符不是递增关系
            else{
                // 如果之前的字符长度比现在的短，则把现在的字符赋给之前的变量
                if(str1.length() > str2.length()){
                    str2 = str1;
                }
                // 清空当前的变量
                str1="";
            }
        }
        return str2;
    }
}
