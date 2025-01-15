package LinkedList.SingleLinkedList;
// Java program to implement a simple Linked List and traverse it

class TraversalSLL {

    // Node class representing each node in the linked list
    class Node {
        int data;
        Node next;

        // Constructor to initialize the node's data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head node of the linked list
    Node head;

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Otherwise, traverse to the end and add the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Function to traverse and print the elements of the linked list
    public void traverseLinkedList() {
        // Start from the head of the linked list
        Node current = head;

        // Traverse the linked list until reaching the end (null)
        while (current != null) {
            // Print the data of the current node
            System.out.print(current.data + " ");
            // Move to the next node
            current = current.next;
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a LinkedList object
        TraversalSLL list = new TraversalSLL();

        // Add elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Traverse and print the linked list
        System.out.print("Linked List: ");
        list.traverseLinkedList();
    }
}
