package src.linkedlist;

public class DoubleLinkedList {

    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node print(Node head){
        Node current = head;
        Node prev=null;
        while (current!=null){
            System.out.print(current.val+"---->");
            //prev=current;
            current=current.prev;

        }
        System.out.print("Null");
        return head;
    }
    public static void main(String[] args){
        Node n1= new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;

        Node printingList = print(n4);
        System.out.print(printingList);
    }



}
