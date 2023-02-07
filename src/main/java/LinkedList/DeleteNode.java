package main.java.LinkedList;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/553/
public class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val=nextNode.val;
        node.next =nextNode;
        nextNode.next=null;
    }
}


