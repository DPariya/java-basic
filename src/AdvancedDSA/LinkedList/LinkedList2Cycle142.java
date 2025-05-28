package AdvancedDSA.LinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class LinkedList2Cycle142 {
    /*
     * Given the head of a linked list, return the node where the cycle begins. If
     * there is no cycle, return null.
     * 
     * There is a cycle in a linked list if there is some node in the list that can
     * be reached again by continuously following the next pointer. Internally, pos
     * is used to denote the index of the node that tail's next pointer is connected
     * to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as
     * a parameter.
     * 
     * Do not modify the linked list.
     * 
     * 
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     */
    public static void main(String[] args) {
        // creating input here
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        // linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;// cycle
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
            if (slow == fast) {
                slow = head;
                int index = 0;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                    index++;
                }
                System.out.println("CYCLE AT " + index);
                return;
            }
        }

        System.out.println(false);

    }
}
