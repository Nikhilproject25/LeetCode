package src.linkedlist;

public class FloydAlgorithm {

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
    public static int checkHead(Node head){
        Node slow = head;
        Node fast =head;
        int exist =0;
        while (slow!=null && fast!=null){
            //if (fast==slow){exist++;}
            fast=fast.next;
            if(fast==slow){exist=1;break;}
            if (fast==null){exist=0;break;}
            fast=fast.next;
            if(fast==slow){exist=1;break;}
            slow=slow.next;
        }

        return exist;
    }

    public static void main(String[] args){
        Node n1= new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n2;
        int result=checkHead(n1);
        System.out.println(result);
    }
}
