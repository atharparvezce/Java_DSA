package LinkedList.CircularLinkedList;

public class InsertAtEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtEnd(Node last, int data) {
        Node newNode = new Node(data);

        if (last == null) {
            newNode.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
        return newNode;

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

        last = insertAtEnd(last, 50);
        System.out.println("List after Inserting: ");
        printList(last);

    }

}
