package LinkedList.CircularLinkedList;

public class SearchingInSCLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean searchKey(Node last, int key) {
        if (last == null)
            return false;
        if (last.data == key)
            return true;

        Node head = last.next;
        Node temp = head;

        while (temp != last) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;

        }
        return false;
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
        Node first = new Node(1);
        Node second = new Node(2);
        Node last = new Node(3);

        first.next = second;
        second.next = last;
        last.next = first;

        System.out.println("Originals List:");

        printList(last);

        boolean result = searchKey(last, 2);

        if (result == true) {
            System.out.println("Key Found");

        } else {
            System.out.println("Key Not Found");

        }

    }
}
