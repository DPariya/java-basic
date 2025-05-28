package AdvancedDSA.LinkedList;

import java.util.List;

import AdvancedDSA.LinkedList.ListNode;

public class ReverseLinkedList206 {
    /*
     * Given the head of a singly linked list, reverse the list, and return the
     * reversed list.
     * 
     * 
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     */
    public static void main(String[] args) {
        // creating input here
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        // linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // actual code
        ListNode prev = null;
        ListNode curr = node1;
        ListNode next;

        while (curr != null) {
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        ListNode.print(prev);

    }
}
