package com.wencongxiao.leetcode;

public class 青蛙跳台阶问题 {

    public  int numWays(int n) {
        int a,b,sum;
        a=b=1;
        sum=0;
        for (int i=0;i<n;i++)
        {  sum=(a+b)%1000000007;
            a=b;
            b=sum;}
        return a;
    }

    public static void main(String args[]) {
        System.out.println();


    }
}
