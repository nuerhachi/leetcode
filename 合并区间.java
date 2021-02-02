package com.wencongxiao.leetcode;

import java.util.Collections;
import java.util.LinkedList;

public class 合并区间 {
   static     public int[][] merge(int[][] intervals) {

       LinkedList<int[]> info = new LinkedList<>();
       for (int[] interval : intervals)
           info.addFirst(interval);
       Collections.sort(info, (a, b) -> a[0] - b[0]);
       LinkedList<int[]> result = new LinkedList<>();
       while (info.size() > 1) {
           int[] array1 = info.pollFirst();
           int[] array2 = info.pollFirst();
           if (array1[1] >= array2[0]) {
               array1[1] = Math.max(array1[1], array2[1]);
               info.addFirst(array1);
               continue;
           }
           result.addFirst(array1);
           info.addFirst(array2);
       }

       if (!info.isEmpty())
           result.add(info.pollFirst());


       int[][] answer = new int[result.size()][2];

       for (int i = 0; i < answer.length; i++)
           answer[i] = result.pollFirst();
       return answer;
   }


    public static void main(String args[]) {
int array[][]={{1,4},{4,5}};
int result[][]=merge(array);

    }}

