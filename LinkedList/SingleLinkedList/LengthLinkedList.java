package LinkedList.SingleLinkedList;

public class LengthLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    Node head;

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

    // Java function to find the length of the linked list
    public int findLength(Node head) {

        // Initialize a counter for the length
        int length = 0;

        // Start from the head of the list
        Node current = head;

        // Traverse the list and increment the length for each
        // node
        while (current != null) {
            length++;
            current = current.next;
        }

        // Return the final length of the linked list
        return length;
    }

    public static void main(String[] args) {

        LengthLinkedList list = new LengthLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int result = list.findLength(list.head);
        System.out.println(result);

    }

}
