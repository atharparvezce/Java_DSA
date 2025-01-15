package LinkedList.DoubleLinkedList;

public class InsertAtPosition {
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

    public static Node insertAtPos(Node head, int pos, int data) {
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            return newNode;
        }

        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;

        }
        if (curr == null) {
            System.out.println("Position is out of bound");
            return head;
        }

        newNode.prev = curr;
        newNode.next = curr.next;
        curr.next = newNode;

        if (curr.next != null) {
            newNode.next.prev = newNode;
        }

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        System.out.println("Before Adding");
        printList(head);

        insertAtPos(head, 2, 40);

        System.out.println("After Adding");
        printList(head);

    }

}
