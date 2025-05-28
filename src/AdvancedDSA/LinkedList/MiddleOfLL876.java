package AdvancedDSA.LinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class MiddleOfLL876 {
    /*
     * Given the head of a singly linked list, return the middle node of the linked
     * list.
     * 
     * If there are two middle nodes, return the second middle node.
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation: The middle node of the list is node 3.
     */
    public static void main(String[] args) {
        // creating input here
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        // linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        // actual code
        ListNode head = node1;
        ListNode slow = head;
        ListNode fast = head;
        // ListNode.print(node1);
        // ListNode.print(slow);
        // ListNode.print(fast);

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode.print(slow);
    }
}
