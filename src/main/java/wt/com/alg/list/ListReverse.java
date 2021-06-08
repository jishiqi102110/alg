package wt.com.alg.list;

public class ListReverse {
    public ListNode ReverseList(ListNode head) {
        //反转链表，头当尾部，然后 标记 当前 之前 后面的值 即可
        // a  b  c
        ListNode second=head.next;
        head.next=null;
        while (second!=null){
            ListNode temp=second.next;

            second.next=head;
            head=second;

            second=temp;
        }
        return head;
    }
}
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
