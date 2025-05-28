package AdvancedDSA.LinkedList;

import java.util.List;

import AdvancedDSA.LinkedList.ListNode;

public class PalindromeLinkedList234 {
    /*
     * Given the head of a singly linked list, return true if it is a palindrome or
     * false otherwise.
     * 
     * 
     * Input: head = [1,2,2,1]
     * Output: true
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        // creating input here
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        // linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // actual code
        ListNode head = node1;
        // 1. find mid
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. reverse from mid
        ListNode temp1 = reverse(slow);
        ListNode temp2 = head;

        // 3. compare start and mid+1
        while (temp1 != null) {
            if (temp1.val != temp2.val) {
                System.out.println("false");
                return;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        System.out.println("true");
        // ListNode.print(prev);

    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
}
