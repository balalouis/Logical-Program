package linkedlist;

public class MySingleLinkList {
    int size;
    Node head;
    Node tail;

    public MySingleLinkList(int value) {
        head = new Node(value);
        size++;
    }

    public void deleteNodeByPosition(int position) {
        printMyLinkedList();
        if (size == 1) {
            head = null;
            size = 0;
        } else if (position == 0) {
            Node headNode = head.next;
            head = headNode;
            size--;
        } else {
            int currentPos = 0;
            Node currentNode = head.next;
            while (currentPos != position - 1) {
                currentPos++;
                currentNode = currentNode.next;
            }
            Node deleteNode = currentNode.next;
            currentNode.next = deleteNode.next;
            if (size == position - 1) {
                tail = currentNode.next;
            }
            size--;
        }
        printMyLinkedList();
    }

    public void deleteNodeByValue(int value) {
        if (head.value == value) {
            head = head.next;
        } else if (head.next != null && head.next.value == value) {
            Node deleteNode = head.next;
            head.next = deleteNode.next;
        } else {
            Node currentNode = head.next;
            Node previousNode = null;
            while (currentNode != null) {
                if (currentNode.value == value) {
                    break;
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
            previousNode.next = currentNode.next;
        }
        size--;
        printMyLinkedList();
    }

    public void insertNode(int value, int position) {
        Node newNode = new Node(value);
        if (position < size) {
            int currPos = 0;
            Node currentNode = head.next;
            while (currentNode != null && currPos < position - 1) {
                currentNode = currentNode.next;
                currPos++;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        } else if (size == position) {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head.next == null) {
            tail = newNode;
            head.next = tail;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        printMyLinkedList();
        size++;
    }

    public void popNode() {
        System.out.println();
        if (head.next == null) {
            head = null;
            size = 0;
        } else {
            Node currentNode = head.next;
            Node previousNode = null;
            while (currentNode != null) {
                if (currentNode.next != null) {
                    previousNode = currentNode;
                }
                currentNode = currentNode.next;
            }
            System.out.println("Pre node: " + previousNode.value);
            previousNode.next = null;
            tail = previousNode;
            size--;
        }
    }

    void printMyLinkedList() {
        System.out.println();
        if (this.head.next == null) {
            System.out.println("Head: " + head.value);
        } else {
            System.out.println("Head: " + head.value);
            Node current = head.next;
            while (current != null) {
                System.out.print("----->" + current.value);
                current = current.next;
            }
        }
    }

}
