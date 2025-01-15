package LinkedList.DoubleLinkedList;

public class InsertAtEnd {
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

    public static void insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

        } else {
            Node curr = head;

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        System.out.println("Before Adding");
        printList(head);

        insertAtEnd(head, 40);

        System.out.println("After Adding");
        printList(head);
    }

}
