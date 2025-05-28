package AdvancedDSA.LinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class DetectAndRemoveLoop {
    /*
     * Given the head of a linked list that may contain a loop. A loop means that
     * the last node of the linked list is connected back to a node in the same
     * list. The task is to remove the loop from the linked list (if it exists).
     * Input: 1 ->2 -> 3 -> 4 , pos = 1 // 4->3
     * Output: 1 -> 2-> 3 -> 4
     * Explanation: The Loop is removed from the above example.
     */
    public static void main(String[] args) {
        // creating input here
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node3;

        ListNode head = node1;
        // actual code

        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null)
            return;

        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;
            slow = slow.next;
            fast = fast.next.next;

        }
        // If cycle exists, remove it
        if (slow == fast) {
            slow = head;
            if (slow == fast) {// Edge case: cycle starts at head
                while (fast.next != slow) {
                    fast = fast.next;
                }

            } else {
                // This case is added if fast and slow
                // pointer meet at first position.
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            fast.next = null;
        }

        ListNode.print(slow);
    }
}
