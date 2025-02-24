package src.linkedlist;

public class Linked {

     public static class Node{
         int data;
         Node next;
         public  Node(int data) {
             this.data = data;
             this.next=null;
         }
     }
     public static void printList(Node head){
         Node current =head;
         while(current!= null){
             System.out.print(current.data + "-->");
             current=current.next;
         }
         System.out.println("Null");
     }
     public static Node atBeginning(Node head,int data){
         Node newNode = new Node(data);
         newNode.next=head;
         head=newNode;
         return head;
     }
     public static Node atEnd(Node head,int data){
         Node newnode = new Node(data);
         Node current =head;
         while (current.next!=null){
             current=current.next;
         }
         current.next=newnode;
         return head;
     }
     public static int findLength(Node head){
         int length =0;
         Node current = head;
         while (current!=null){
             length++;
             current=current.next;
         }
         return length;

     }
     public static void middleChar(Node head,int length){
         Node current =head;
             int x = length / 2;
             for (int i = 0; i < x; i++) {
                 current = current.next;  // Move x times
             }
             System.out.println("Middle element: " + current.data);
     }

     public static void rotate(Node head,int k){
         Node current = head;
         while(current!=null){
             for(int i=1;i<=k;i++){

             }
         }
     }

    public static void main(String[] args) {
         int k=4;
        Node node1 = new Node(5);
        Node node2 = new Node(6);
        node1.next =node2;


       // printList(node1);

        Node new1= atBeginning(node1,4);
        printList(new1);

        Node new2 =atEnd(node1,8);
        printList(new2);
        int l= findLength(node1);
        System.out.println("The length of linkedList"+l);
        middleChar(node1,l);
        rotate(node1,k);

    }
}
