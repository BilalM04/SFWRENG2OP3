/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (40 marks)
    Use java to implement a data structure named LinkedList, and implement several methods of the LinkedList.

 */

class Node {
    int data; // 'data' stores the value of a node.
    Node next; // 'next' refers/points to the next node

    // the construction method of class Node.
    Node(int d) {
        data = d;
        next = null;
    }
}

class Q2_LinkedList {
    Node head;

    // Insert 'new_data' at the beginning of the LinkedList
    // (5 marks)
    public void insertAtBeginning(int new_data) {
        /* place your code here */
        if (head == null) {
            head = new Node(new_data);
        } else {
            Node runner = head;
            head = new Node(new_data);
            head.next = runner;
        }

    }

    // Insert 'new_data' at the end of the LinkedList
    // (5 marks)
    public void insertAtEnd(int new_data) {
        /* place your code here */
        Node runner = head;

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        while (runner.next != null) {
            runner = runner.next;
        }

        runner.next = new Node(new_data);
    }

    // Insert 'new_data' after a node referred to as 'prev_node'
    // (10 marks)
    public void insertAfter(Node prev_node, int new_data) {
        /* place your code here */
        Node runner = prev_node.next;
        prev_node.next = new Node(new_data);
        prev_node.next.next = runner;
    }

    // Delete a node located in 'position' of the Linked List. The first element of the LinkedList has a position=0.
    // (10 marks)
    void deleteNode(int position) {
        /* place your code here */
        int currentPosition = 0;
        Node runner = head;

        if (position == 0) {
            head = head.next;
            return;
        }

        while (currentPosition < position - 1) {
            runner = runner.next;
            currentPosition++;
        }

        runner.next = runner.next.next;
    }

    // Search for a node containing the value of 'key' in the LinkedList.
    // If there is a node in the LinkedList whose value is equal to 'key', then return 'true'.
    // If there is no node in the LinkedList whose value is equal to 'key', then return 'false'.
    // (15 marks)
    boolean search(Node head, int key) {
        /* place your code here */
        if (head == null) {
            return false;
        }

        if (head.data == key) {
            return true;
        }
        else {
            if (head.next != null) {
                search(head.next, key);
            }
        }
        return false;
    }

    // Sort the nodes in the LinkedList in ascending orders of their values.
    // Requirement: please use bubble sort.
    // Example: for a LinkedList: head->3->5->1->4->2, the sorted LinkedList should be head->1->2->3->4->5.
    // (15 marks)
    void sortLinkedList(Node head) {
        /* place your code here */
        int length = this.length();
        Node runner = head;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (runner.data > runner.next.data) {
                    int temp = runner.data;
                    runner.data = runner.next.data;
                    runner.next.data = temp;
                }
                runner = runner.next;
            }
            runner = head;
        }
    }

    public int length() {
        int count = 0;
        Node runner = head;

        while (runner != null) {
            runner = runner.next;
            count++;
        }

        return count;
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        /* TA may test different functions of the LinkedList here */
        /* The following is just an example of how to do the test. */

        Q2_LinkedList llist = new Q2_LinkedList();

        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head.next, 5);

        System.out.println("Linked list: ");
        llist.printList();

        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(3);
        llist.printList();

        System.out.println();
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

        llist.sortLinkedList(llist.head);
        System.out.println("\nSorted List: ");
        llist.printList();
    }
}