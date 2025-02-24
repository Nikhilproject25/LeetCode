package src.linkedlist;

// Node class definition
class Node {
    int data;   // Data stored in the node
    Node next;  // Reference to the next node

    // Constructor to create a new node
    Node(int data) {
        this.data = data;  // Initialize data
        this.next = null; // By default, the next node is null
    }
}

// Main class to test the Node creation
public class LinkedList {
    // Method to find the length of the linked list
    public static int findLength(Node head) {
        int length = 0;          // Initialize length counter
        Node current = head;     // Start from the head of the list

        // Traverse the list and count nodes
        while (current != null) {
            length++;           // Increment length for each node
            current = current.next;  // Move to the next node
        }

        return length;  // Return the total length
    }

    // Method to insert a node at the beginning of the list
    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);  // Create a new node
        newNode.next = head;            // Point the new node to the current head
        head = newNode;                 // Update the head to the new node
        return head;                    // Return the new head
    }

    // Method to insert a node at the end of the list
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);  // Create a new node

        if (head == null) {
            head = newNode;  // If the list is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // Traverse to the last node
            }
            current.next = newNode;  // Point the last node to the new node
        }

        return head;  // Return the head of the list
    }

    // Method to insert a node after a specific node
    public static void insertAfter(Node previousNode, int data) {
        if (previousNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(data);  // Create a new node
        newNode.next = previousNode.next;  // Point the new node to the next node of the previous node
        previousNode.next = newNode;      // Point the previous node to the new node
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(10);  // Node with data = 10
        Node node2 = new Node(20);  // Node with data = 20
        Node node3 = new Node(30);  // Node with data = 30

        // Link the nodes
        node1.next = node2;  // node1 -> node2
        node2.next = node3;  // node2 -> node3

        // Print the initial linked list
        System.out.println("Initial Linked List:");
        printList(node1);  // Output: 10 -> 20 -> 30 -> null

        // Insert a node at the beginning
        node1 = insertAtBeginning(node1, 5);
        System.out.println("After inserting 5 at the beginning:");
        printList(node1);  // Output: 5 -> 10 -> 20 -> 30 -> null

        // Insert a node at the end
        node1 = insertAtEnd(node1, 40);
        System.out.println("After inserting 40 at the end:");
        printList(node1);  // Output: 5 -> 10 -> 20 -> 30 -> 40 -> null

        // Insert a node after a specific node (e.g., after node2 with data = 20)
        insertAfter(node2, 25);
        System.out.println("After inserting 25 after node2 (20):");
        printList(node1);  // Output: 5 -> 10 -> 20 -> 25 -> 30 -> 40 -> null

        // Find the length of the linked list
        int length = findLength(node1);
        System.out.println("Length of the linked list: " + length);  // Output: 6
    }
}