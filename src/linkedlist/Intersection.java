package src.linkedlist;

public class Intersection {
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
    public static void print(Node head){
        while (head!=null){
            System.out.print(head.val+"---->");
            head=head.next;
        }
        System.out.print("Null");
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node ptrA = headA;
        Node ptrB = headB;
        while (ptrA != ptrB) { // loop until we find the first common node
            if (ptrA == null) {
                ptrA = headB; // if ptrA reaches the end, switch to headB
            } else {
                ptrA = ptrA.next; // otherwise, move to the next node in ListA
            }
            if (ptrB == null) {
                ptrB = headA; // if ptrB reaches the end, switch to headA
            } else {
                ptrB = ptrB.next; // otherwise, move to the next node in ListB
            }
        }
        System.out.println(ptrA);
        return ptrA; // return the intersection node (or null if no intersection)
    }
    public static void main(String[] args){
        Node n1= new Node(4);//4,1,8,4,5
        n1.next=new Node(1);
        n1.next.next=new Node(8);
        n1.next.next.next=new Node(4);
        n1.next.next.next.next=new Node(5);

        Node n2= new Node(5);//[5,6,1,8,4,5]
        n2.next=new Node(6);
        n2.next.next=new Node(1);
        n2.next.next.next=new Node(8);
        n2.next.next.next.next=new Node(4);
        n2.next.next.next.next.next=new Node(5);

        print(n1);
        System.out.println();
        print(n2);
        Node intersectionNode= getIntersectionNode(n1,n2);
        System.out.println(intersectionNode);
    }
}
