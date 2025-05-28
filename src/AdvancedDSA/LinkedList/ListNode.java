package AdvancedDSA.LinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    } // empty constructor : It's typically used when you want to create a ListNode
      // object but don't yet have the values for its val and next properties.

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static void print(ListNode root) {
        ListNode head = root;

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
