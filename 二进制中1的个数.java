package com.wencongxiao.leetcode;

public class 二进制中1的个数 {
    public int hammingWeight(int n) {
        int count=0;
while (n!=0)
{
    count+=n&1;
    n=n>>>1;
}
        return count;

    }

    public static void main(String args[]) {


    }
}
