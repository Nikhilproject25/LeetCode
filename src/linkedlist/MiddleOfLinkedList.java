package src.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleOfLinkedList {
    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Middle node
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        ListNode middle = findMiddle(head);
        System.out.println("Middle Node: " + (middle != null ? middle.val : "null"));

        // Example with an even number of nodes: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        head.next.next.next.next.next = new ListNode(6);
        printList(head);
        middle = findMiddle(head);
        System.out.println("Middle Node: " + (middle != null ? middle.val : "null"));
    }
}
