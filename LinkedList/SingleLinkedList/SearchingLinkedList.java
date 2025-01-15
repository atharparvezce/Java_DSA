package LinkedList.SingleLinkedList;

public class SearchingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Otherwise, traverse to the end and add the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Java function to search for a value in the Linked List
    public boolean searchLinkedList(Node head, int target) {
        // Traverse the Linked List

        Node current = head;
        while (current != null) {

            // Check if the current node's data matches the
            // target value
            if (current.data == target) {

                // Value found
                return true;
            }

            // Move to the next node
            current = current.next;
        }

        // Value not found
        return false;
    }

    public static void main(String[] args) {

        SearchingLinkedList list = new SearchingLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int target = 30;
        boolean result = list.searchLinkedList(head, target);
        System.out.println(result);

    }

}
