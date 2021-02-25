package com.wencongxiao.leetcode;
/*
Created by wcx
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;


public class 滑动窗口的最大值 {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0)
            return nums;
        else {
            int i = 0, start = 0, len;
            len = nums.length - k + 1;
            int[] res = new int[len];
            LinkedList<Integer> linkedList = new LinkedList<>();
            while (i < k) {
                while (!linkedList.isEmpty() && linkedList.peekLast() < nums[i])
                    linkedList.removeLast();
                linkedList.add(nums[i++]);

            }
            res[start++] = linkedList.peekFirst();
            while (start < len) {
                if (linkedList.peekFirst() == nums[i-k])
                    linkedList.removeFirst();
                while (!linkedList.isEmpty() && linkedList.peekLast() < nums[i])
                    linkedList.removeLast();
                linkedList.add(nums[i++]);
                res[start++] = linkedList.peekFirst();
            }


            return res;
        }
    }


    public static void main(String[] args) {
        int a[] = {1, -1};
        int b[] = maxSlidingWindow(a, 1);
        for (int i : b)
            System.out.println(i);
    }
}
