package com.wencongxiao.leetcode;

import java.util.LinkedList;

public class 从尾到头打印链表 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            ListNode q = head;
            if (q != null) {
                linkedList.add(head.val);

                while (q.next != null) {
                    q = q.next;
                    linkedList.addFirst(q.val);
                }
            }

            Object[] array = linkedList.toArray();
            int[] res = new int[array.length];
            for (int i = 0; i < array.length; i++)
                res[i] = (int) array[i];
            return res;
        }
    }

    public static void main(String args[]) {


    }
}
