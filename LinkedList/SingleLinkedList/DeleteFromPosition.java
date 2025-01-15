package LinkedList.SingleLinkedList;

public class DeleteFromPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static void deleteFromPos(Node head, int position) {
        // If the list is empty or the position is invalid
        if (head == null || position < 1) {
            return;
        }

        // If the head needs to be deleted
        if (position == 1) {
            head = head.next;
            return;
        }

        // Traverse to the node before the position to be
        // deleted
        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        // If the position is out of range
        if (current == null || current.next == null) {
            return;
        }

        // Update the links to bypass the node to be deleted
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("List before deleting");
        printList(head);

        deleteFromPos(head, 3);
        System.out.println("List before deleting");
        printList(head);

    }
}
