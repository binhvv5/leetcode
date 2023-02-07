package main.java.LinkedList;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/560/
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current !=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

}
