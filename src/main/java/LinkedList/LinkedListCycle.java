package main.java.LinkedList;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/773/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return true;
            }
        }
        return false;
    }
}
