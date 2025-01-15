package LinkedList.DoubleLinkedList;

public class DeleteFromBegining {

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

    static Node deleteFromBegining(Node head) {

        Node temp = head;

        if (temp == null) {
            return null;
        }

        temp = temp.next;

        if (temp.prev != null) {

            temp.prev = null;

           

        }
        
        return temp;

         

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        System.out.println("Before deleting the elements of list are :");
        printList(head);

        head = deleteFromBegining(head);

        System.out.println("After deleting the elements of list are :");
        printList(head);
    }

}
