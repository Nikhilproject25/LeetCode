package src.linkedlist;

public class Linked1 {

    public static class Node{
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
            this.next=null;

        }
    }
    public void print(Node head){
        Node current = head;
        while (current!= null){
            System.out.print(current.val+ "-->");
            current=current.next;

        }
        System.out.println("Null ");
    }
    public static Node atBegning(Node head,int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static Node atEnd(Node head,int val){
        Node newNode = new Node(val);
        Node current = head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        return head;
    }
    public static Node deleteBegin(Node head){

        if(head==null){
            return null;
        }else {
            head=head.next;
        }
        return head;
    }
    public static int lengthOfList(Node head){
        int length=0;
        Node current=head;
        while(current!=null){
            length=length+1;
            current=current.next;
        }
        return length;
    }
    public static Node middleOfList(Node head,int length){
        Node current= head;
       if(length/2==0){
        for(int i=0;i<=length/2;i++){
            current=current.next;
        }
        return current;
       } else {
           for (int i=0;i<length/2;i++){
               current=current.next;
           }
       }
        return current;
    }
    public static Node reverseList(Node head) {
        Node prev = null; // Previous node
        Node current = head; // Current node
        Node next = null; // Temporary node to store the next node

        while (current != null) {
            System.out.println("current"+ current.val);
            next = current.next; // Store the next node
            System.out.println("current.next"+ current.next.val);
            current.next = prev; // Reverse the current node's pointer
            System.out.println("prev"+prev);
            prev = current; // Move prev to the current node
            System.out.println("current"+ current.val);
            current = next; // Move current to the next node
            System.out.println("next"+ next.val);
        }

        head = prev; // Update head to the new first node (previously the last node)
        return head;
    }
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        Node slow = head; // Slow pointer (moves 1 step at a time)
        Node fast = head; // Fast pointer (moves 2 steps at a time)

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1 step
            fast = fast.next.next; // Move fast by 2 steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle detected
    }
    public static void main(String[] args){
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);
        Node n4 = new Node(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;
        Linked1 l = new Linked1();
        //l.print(n1);
        /*Node reverse= reverseList(n1);
        l.print(reverse);*/

        /*Node beginning= atBegning(n1,4);
        l.print(beginning);

        Node end = atEnd(n1,8);
        l.print(end);

        Node delete = deleteBegin(n1);
       l.print(delete);*/

       /*int length= lengthOfList(n1);
       System.out.println(length);

       Node middle=middleOfList(n1,length);
       System.out.println(middle.val);*/
        boolean hasCycle = hasCycle(n1);
        System.out.println("Does the linked list have a cycle? " + hasCycle);

    }
}
