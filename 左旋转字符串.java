package com.wencongxiao.leetcode;

public class 左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        String res,a;
        a=s.substring(0,n-1);
        res=s.substring(n,s.length()-1)+a;
        return res;
    }

    public static void main(String args[]) {


    }
}
