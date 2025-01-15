package LinkedList.DoubleLinkedList;

public class InsertAtBegining {
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

    public static void printList(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node insertAtBegin(Node head, int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        if (head != null) {
            head.prev = newNode;

        }
        return newNode;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        System.out.println("Before Insert:");
        printList(head);

        head = insertAtBegin(head, 0);

        System.out.println("After Insert:");
        printList(head);

    }

}
