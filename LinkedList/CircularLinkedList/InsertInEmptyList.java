package LinkedList.CircularLinkedList;

public class InsertInEmptyList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertInEmpty(Node last, int data) {
        if (last != null) {
            return last;
        }

        Node newNode = new Node(data);

        newNode.next = newNode;
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
        Node last = null;

        System.out.println("Original List:");
        printList(last);

        last = insertInEmpty(last, 10);
        System.out.println("List after Inserting: ");
        printList(last);

    }

}
