package before;

public class 两个链表的第一个公共结点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != q) {
            p = (p == null) ? headB : p.next;
            q = (q == null) ? headA : q.next;

        }
        return p;
    }


    public static void main(String args[]) {


    }
}
