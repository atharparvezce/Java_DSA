package LinkedList.SingleLinkedList;

public class DeleteFromEnd {

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

    public static Node deleteFromEnd(Node head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;

        return head;
    }

    public static void main(String[] args) {

        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(60);

        System.out.println("List before deleting");
        printList(head);

        head =deleteFromEnd(head);

        System.out.println("List after deleting");
        printList(head);

    }

}
