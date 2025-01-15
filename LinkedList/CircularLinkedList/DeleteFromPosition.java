package LinkedList.CircularLinkedList;

public class DeleteFromPosition {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteFromPos(Node last, int key) {
        if (last == null) {
            return null;
        }

        Node curr = last.next;
        Node prev = last;

        if (curr == last && curr.data == key) {
            last = null;
            return last;
        }

        if (curr.data == key) {
            last.next = curr.next;
            return last;
        }
        while (curr != last && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.data == key) {
            prev.next = curr.next;
            if (curr == last) {
                last = prev;
            }

        }
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

        last = deleteFromPos(last, 20);
        System.out.println("List after deleting: ");
        printList(last);

    }

}
