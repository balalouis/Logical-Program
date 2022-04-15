package linkedlist;

import static java.lang.System.out;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedList(int value) {
        head = new Node(value);
        tail = head;
        size = 1;
    }

    public void delete(int position) {
        out.println();
        Node deleteNode = null;
        if (size == 0) {
            out.println("Sorry there is no item in the list");
        } else if (size == 1) {
            deleteNode = head;
            head = null;
            size = 0;
        } else if (position == 0) {
            deleteNode = head;
            head = head.next;
            head.prev = null;
            size--;
        } else if (size == position) {
            deleteNode = tail;
            tail = tail.prev;
            tail.next = null;
            size--;
        } else {
            int currentPos = 1;
            Node currentNode = head.next;
            while (currentPos != position) {
                currentPos++;
                currentNode = currentNode.next;
            }
            deleteNode = currentNode;
            Node prevNode = deleteNode.prev;
            Node nextNode = deleteNode.next;
            prevNode.next = nextNode;

            if (nextNode != null) {
                nextNode.prev = prevNode;
            }
            size--;
        }
        if (deleteNode != null) {
            out.println("Deleted node: " + deleteNode.value);
            printDoubleLinkedListData();
        }
    }

    public void insert(int value, int position) {
        Node newNode = new Node(value);
        if (size == 1) {
            newNode.prev = head;
            head.next = newNode;
            tail = newNode;
        } else if (size == position) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            int currentPos = 1;
            Node currentNode = head.next;
            while (currentPos != position) {
                currentPos++;
                currentNode = currentNode.next;
            }
            newNode.next = currentNode;
            newNode.prev = currentNode.prev;
            newNode.prev.next = newNode;
            currentNode.prev = newNode;
        }
        size++;
        out.println();
        printDoubleLinkedListData();
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (size == 1) {
            newNode.prev = head;
            head.next = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
        out.println();
        printDoubleLinkedListData();
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (size == 1) {
            newNode.next = head;
            head.prev = newNode;
            tail = head;
            head = newNode;

        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        out.println();
        printDoubleLinkedListData();
    }

    public void printDoubleLinkedListData() {
        if (head != null) {
            out.print("Head -->" + head.value);
            Node currentNode = head.next;
            while (currentNode != null) {
                out.print("-----> " + currentNode.value);
                currentNode = currentNode.next;
            }
        }
    }

    public void reverse() {
        out.println();
        if (size == 0) {
            out.println("There is no item in list");
        } else if (size == 1) {
            out.println(head.value);
        } else {
            Node currentNode = tail;
            while (currentNode != null) {
                out.println(currentNode.value);
                currentNode = currentNode.prev;
            }
        }
    }
}

