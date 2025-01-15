package LinkedList.CircularLinkedList;

public class DeleteFromEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node deleteFromEnd(Node last) {
        if (last == null) {
            // If the list is empty
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
        Node head = last.next;

        // If there is only one node in the list
        if (head == last) {
            last = null;
            return last;
        }
        // Traverse the list to find the second last node
        Node curr = head;
        while (curr.next != last) {
            curr = curr.next;
        }
        // Update the second last node's next pointer to
        // point to head
        curr.next = head;
        last = curr;

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

        System.out.println("Original list: ");
        printList(last);

        last = deleteFromEnd(last);
        System.out.println("List after deleting last node: ");
        printList(last);
    }

}
