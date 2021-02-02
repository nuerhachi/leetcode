package com.wencongxiao.leetcode;

public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p=head;
        for(int i=0;i<k;i++)
            p=p.next;
        ListNode q=head;
        while(p!=null)
        {p=p.next;
            q=q.next;}
        return q;
    }

    public static void main(String args[]) {


    }
}
