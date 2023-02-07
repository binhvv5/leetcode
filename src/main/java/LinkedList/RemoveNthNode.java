package main.java.LinkedList;
//https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/603/
public class RemoveNthNode {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode suf = head;

        for (int i =0 ; i < n ;i ++){
            pre = pre.next;
        }
        if (pre == null) return head.next;
        while (pre.next!=null){
            pre = pre.next;
            suf = suf.next;
        }
        suf.next = suf.next.next;
        return head;
    }
}
