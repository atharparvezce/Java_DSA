package LinkedList.CircularLinkedList;

public class DeleteFromBegining {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node deleteFromBegining(Node last) {

        if (last == null) {

            return null;
        }

        Node head = last.next;

        if (head == last) {

            last = null;

        } else {

            last.next = head.next;
        }
        return last;
    }

    public static void printList(Node last) {

        if (last == null)
            return;

        Node head = last.next;

        while (true) {
            System.out.print(head.data + " ");
            head = head.next;

            if (head == last.next)
                break;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);

        Node last = first.next.next;
        last.next = first;

        System.out.println("Original list: ");
        printList(last);

        last = deleteFromBegining(last);
        System.out.println("List after deleting first node: ");
        printList(last);

    }

}
