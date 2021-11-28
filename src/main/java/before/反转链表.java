package before;


public class 反转链表 {



        public ListNode reverseList(ListNode head) {
            ListNode p, q , res = null;
            p = head;
            q=new ListNode(0);
            while (p != null) {
                q.val = p.val;
                q.next = res;
                res=q;
                p = p.next;

            }
            return res;
        }

    public static void main(String args[]) {


    }
}
