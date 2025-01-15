package LinkedList.DoubleLinkedList;

public class DeleteFromPosition {

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

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    // Function to delete a node at a
    // specific position in the doubly linked list
    public static Node deleteFromPos(Node head, int pos) {

        // If the list is empty
        if (head == null) {
            return head;
        }

        Node curr = head;

        // Traverse to the node at the given position
        for (int i = 1; curr != null && i < pos; ++i) {
            curr = curr.next;
        }

        // If the position is out of range
        if (curr == null) {
            System.out.println("Invalid Pos");
            return head;

        }

        // Update the previous node's next pointer
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }

        // Update the next node's prev pointer
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        // If the node to be deleted is the head node
        if (head == curr) {
            head = curr.next;
        }

        // Return the updated head
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        System.out.println("Before Deletion");
        printList(head);

        head = deleteFromPos(head, 3);
        System.out.println("After Deletion");
        printList(head);
    }
}
