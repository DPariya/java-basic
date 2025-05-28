package AdvancedDSA.LinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class RemoveNthNodeFromEnd19Brute {
    /*
     * Given the head of a linked list, remove the nth node from the end of the list
     * and return its head.
     * 
     * 
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     * ✅ Time Complexity: O(2N) (One pass to count, one pass to remove)
     * ✅ Space Complexity: O(1)
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
        ListNode head = node1;
        int n = 2; // remove 2nd node from end
        // actual code
        ListNode slow = head, fast = head;
        ListNode temp = head;
        // Step 1: Move fast pointer `n+1` steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // If `fast` becomes null, remove the first node
        if (fast == null) {
            ListNode.print(head.next);
        }
        // Step 2: Move both slow and fast until fast reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove the target node
        slow.next = slow.next.next;

        ListNode.print(head);

    }
}
