package AdvancedDSA.LinkedList;

import java.util.List;

import AdvancedDSA.LinkedList.DLLNode;

public class ReverseDoublyLinkedList {
    /*
     * Given a doubly linked list. Your task is to reverse the doubly linked list
     * and return its head.
     * 
     * Input: LinkedList: 3 <-> 4 <-> 5
     * Output: 5 <-> 4 <-> 3
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        // creating input here
        DLLNode node1 = new DLLNode(3);
        DLLNode node2 = new DLLNode(4);
        DLLNode node3 = new DLLNode(5);
        // linking nodes
        node1.next = node2;
        node1.prev = null;

        node2.next = node3;
        node2.prev = node1;

        node3.prev = node2;
        node3.next = null;

        // actual code
        DLLNode prev = null;
        DLLNode curr = node1;
        DLLNode next = null;

        while (curr != null) {
            next = curr.next;

            curr.next = curr.prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        DLLNode.print(prev);
    }

}
