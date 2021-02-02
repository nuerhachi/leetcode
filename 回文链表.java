package com.wencongxiao.leetcode;

import java.util.LinkedList;

public class 回文链表 {
    public boolean isPalindrome(ListNode head) {

        LinkedList<Integer> linklist=new LinkedList<>();


        ListNode p=head;

        while(p!=null)
        {linklist.addFirst(p.val);
            p=p.next;}
      p=head;
        while (!linklist.isEmpty())
        {   if (linklist.pop()!=p.val)
            return false;
        p=p.next;}
        return true;

    }
//高级


   public static void main(String args[]) {


    }
}

