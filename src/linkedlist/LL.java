package src.linkedlist;

public class LL {

    public class Ndoe{
        int data;
        Node next;
        public Ndoe(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void printList(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }
    public void atBeginning(Node head){
        Node newNode = new Node(5);
        newNode.next = head;
    }

    public static void main(String[] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next=node2;
        node2.next=node3;
        System.out.println("New Linked List::");
        LL l = new LL();
        l.printList(node1);
    }



}
