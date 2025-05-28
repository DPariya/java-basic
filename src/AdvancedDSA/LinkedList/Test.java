package AdvancedDSA.LinkedList;

// import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    } // empty constructor : It's typically used when you want to create a ListNode
      // object but don't yet have the values for its val and next properties.

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static void print(ListNode slow) {
        // TODO:: Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
}

public class Test {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        // Link the nodes together
        node1.next = node2;
        node2.next = node3;

        // print
        ListNode curr = node1; // curr stores the reference of the node1 here, meaning curr now points to node1
        // (not its values directly).
        // So curr.val is 10, and curr.next is a pointer to node2.

        int data = 40;
        // **** add node at end
        ListNode node4 = new ListNode();
        node4.val = data;
        node3.next = node4;
        System.out.println("Add at end : 40");
        print(curr);

        // *** add node at beginning */
        ListNode node0 = new ListNode();
        node0.val = 01;
        node0.next = node1;

        System.out.println();
        System.out.println("Add at beginning :1");

        // add at middle after 20, node2
        ListNode temp = new ListNode(22);
        temp.next = node2.next;
        node2.next = temp;

        print(node0);

        // ** Delete node from end */ node4
        node3.next = null;
        System.out.println();
        System.out.println("After deleting node4 : end & add at middle after 20");

        print(node0);

        // ** Delete from middle , 22*/
        System.out.println();
        System.out.println("After deleting added new node 22 : from middle");

        node2.next = node3;
        print(node0);

        // ** Delete from start , node0*/
        System.out.println();
        System.out.println("After Delete from start : node0");
        node0.next = null;
        print(node1);

    }

    public static void print(ListNode root) {
        ListNode head = root;

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
