package LinkedList.CircularLinkedList;

public class InsertAtPosition {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtPos(Node last, int data, int pos) {

        if (last == null) {

            // If the list is empty
            if (pos != 1) {
                System.out.println("Invalid position!");
                return last;
            }
            // Create a new node and make it point to itself
            Node newNode = new Node(data);
            last = newNode;
            last.next = last;
            return last;
        }

        // Create a new node with the given data
        Node newNode = new Node(data);

        // curr will point to head initially
        Node curr = last.next;

        if (pos == 1) {
            // Insert at the beginning
            newNode.next = curr;
            last.next = newNode;
            return last;
        }

        // Traverse the list to find the insertion point
        for (int i = 1; i < pos - 1; ++i) {
            curr = curr.next;

            // If position is out of bounds
            if (curr == last.next) {
                System.out.println("Invalid position!");
                return last;
            }
        }

        // Insert the new node at the desired position
        newNode.next = curr.next;
        curr.next = newNode;

        // Update last if the new node is inserted at the
        // end
        if (curr == last)
            last = newNode;

        return last;
    }

    public static void printList(Node last) {
        if (last == null) {
            return;
        }

        Node head = last.next;

        while (true) {
            System.out.println(head.data);
            head = head.next;

            if (head == last.next) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node last = new Node(30);

        first.next = second;
        second.next = last;
        last.next = first;

        System.out.println("Original List:");
        printList(last);

        last = insertAtPos(last, 50, 2);
        System.out.println("List after Inserting: ");
        printList(last);

    }

}
