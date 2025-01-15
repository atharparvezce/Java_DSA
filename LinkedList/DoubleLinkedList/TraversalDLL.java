package LinkedList.DoubleLinkedList;

public class TraversalDLL {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Function to traverse the doubly linked list
    // in forward direction
    public static void forwardTraversal(Node head) {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Function to traverse the doubly linked list
    // in backward direction
    public static void backwardTraversal(Node tail) {
        Node current = tail;

        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }

    }

    // Function to find length of the doubly linked list
    public static void lengthOfDLL(Node head) {
        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println("Length of DLL: " + length);
    }

    public static void main(String[] args) {

        // Two ways to create a DLL
        // One
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        // Two
        // Node head = new Node(10);
        // Node second = new Node(20);
        // Node third = new Node(30);

        // head.next = second;
        // second.prev = head;
        // second.next = third;
        // third.prev = second;

        System.out.println("Forward");
        forwardTraversal(head);
        System.out.println("Backward");
        backwardTraversal(head.next.next);

        lengthOfDLL(head);

    }
}
