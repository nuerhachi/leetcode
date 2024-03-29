package before;

public class 合并两个排序链表 {

    //递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        else if(l1.val<=l2.val)
        {l1.next=mergeTwoLists(l1.next,l2);
            return l1;}
        else
        {l2.next=mergeTwoLists(l1,l2.next);
            return l2;}
    }

/*    //非递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode res=new ListNode(0),curr=res;

        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {curr.next=l1;
                l1=l1.next;}
            else
            {curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=(l2==null)?l1:l2;
        return res.next;
    }*/

    public static void main(String args[]) {


    }
}
