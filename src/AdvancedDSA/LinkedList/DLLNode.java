package AdvancedDSA.LinkedList;

public class DLLNode {
    public int val;
    public DLLNode prev;
    public DLLNode next;

    public DLLNode() {
    } // empty constructor : It's typically used when you want to create a DLLNode
      // object but don't yet have the values for its val and next properties.

    public DLLNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }

    public static void print(DLLNode root) {
        DLLNode head = root;

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    // TODO::::
    public static void printReverse(DLLNode root) {
        DLLNode head = root;

        while (head != null) {
            System.out.println(head.val);
            head = head.prev;
        }
    }

}
