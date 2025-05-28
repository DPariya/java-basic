package AdvancedDSA.LinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class RemoveNthNodeFromEnd19Optimal {
    /*
     * Given the head of a linked list, remove the nth node from the end of the list
     * and return its head.
     * 
     * 
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
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

        int n = 2; // remove 2nd node from end
        // actual code
        // Find length of list
        int length = 0;
        ListNode temp = node1;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        // find position to remove from start
        int pos = length - n;

        // if we need to remove 1st node
        if (pos == 0) {
            System.out.println(node1.next);
            return;
        }
        temp = node1;
        // traverse to remove the target node
        for (int i = 0; i < pos - 1; i++) { // coz we need to update it's previous node's next
            temp = temp.next;

        }
        temp.next = temp.next.next;
        ListNode.print(node1);

    }
}
