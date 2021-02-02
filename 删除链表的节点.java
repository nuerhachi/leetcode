package com.wencongxiao.leetcode;

public class 删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode cuur=head;
        if(head.val!=val) {
            while(cuur.next.val!=val)
                cuur=cuur.next;
            cuur.next=cuur.next.next;
        }
        else head=head.next;
        return head;
    }

    public static void main(String args[]) {


    }
}
