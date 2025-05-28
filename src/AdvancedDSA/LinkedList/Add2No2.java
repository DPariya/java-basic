package AdvancedDSA.LinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class Add2No2 {
    /*
     * You are given two non-empty linked lists representing two non-negative
     * integers. The digits are stored in reverse order, and each of their nodes
     * contains a single digit. Add the two numbers and return the sum as a linked
     * list.
     * 
     * You may assume the two numbers do not contain any leading zero, except the
     * number 0 itself.
     * 
     * 
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     */
    public static void main(String[] args) {
        // creating input here
        // l1
        ListNode l1node1 = new ListNode(2);
        ListNode l1node2 = new ListNode(4);
        ListNode l1node3 = new ListNode(3);
        // l2
        ListNode l2node1 = new ListNode(5);
        ListNode l2node2 = new ListNode(6);
        ListNode l2node3 = new ListNode(4);
        // linking nodes
        l1node1.next = l1node2;
        l1node2.next = l1node3;
        l2node1.next = l2node2;
        l2node2.next = l2node3;

        ListNode l1 = l1node1;
        ListNode l2 = l2node1;

        // actual code
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null)
                sum += l1.val;
            if (l2 != null)
                sum += l2.val;
            sum += carry;
            carry = sum / 10; // 1st digit

            ListNode temp = new ListNode(sum % 10);// 2nd digit
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        while (carry != 0) {
            ListNode temp = new ListNode(carry % 10);
            carry /= 10;
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
        }

        ListNode.print(head);
        // ListNode.print(l2);

    }
}
