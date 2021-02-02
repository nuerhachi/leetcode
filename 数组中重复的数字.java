package com.wencongxiao.leetcode;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

public class 数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i:nums)
        {  while (!hashSet.contains(i))
                hashSet.add(i);
           return i;}
            return -1;
    }

}
