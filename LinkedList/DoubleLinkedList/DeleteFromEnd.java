package LinkedList.DoubleLinkedList;

public class DeleteFromEnd {

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

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static Node deleteFromEnd(Node head) {
      
        // Corner cases
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        // Traverse to the last node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Update the previous node's next pointer
        if (curr.prev != null) {
            curr.prev.next = null;
        }

        // Return the updated head
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        System.out.println("Before Deletion");
        printList(head);

        head = deleteFromEnd(head);
        System.out.println("After Deletion");
        printList(head);
    }
}
