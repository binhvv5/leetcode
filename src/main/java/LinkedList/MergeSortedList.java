package main.java.LinkedList;
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/771/
public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead =  new ListNode(0);
        ListNode head =  preHead;
        while (list1 != null && list2!=null){
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        head.next = list1 == null ? list2 : list1;
        return preHead.next;
    }
}
