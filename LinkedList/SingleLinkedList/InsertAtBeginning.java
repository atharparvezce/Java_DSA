package LinkedList.SingleLinkedList;

public class InsertAtBeginning {

    // Node class to represent each element in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head;

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // Set the next pointer of the new node to the current head
        newNode.next = head;

        // Move the head to point to the new node, making it the first node
        head = newNode;
    }

    // Method to traverse and print the elements of the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the linked list insertion at the beginning
    public static void main(String[] args) {
        InsertAtBeginning list = new InsertAtBeginning();

        // Insert nodes at the beginning of the list
        list.insertAtBeginning(50);
        list.insertAtBeginning(40);
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        // Display the final linked list
        System.out.println("Linked List after insertions at the beginning:");
        list.printList();
    }
}
