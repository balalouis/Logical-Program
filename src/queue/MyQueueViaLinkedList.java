package queue;


import static java.lang.System.out;

public class MyQueueViaLinkedList {

    public Node front;
    public Node back;
    public int size;

    public MyQueueViaLinkedList(int value) {
        Node newNode = new Node(value);
        front = newNode;
        back = newNode;
        size = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (size > 0) {
            back.next = newNode;
            back = newNode;
            size++;
            printQueueEntry();
        }
    }

    public void pop() {
        out.println();
        if (size == 0) {
            out.println("Queue is empty");
        } else {
            out.println("Popped node: " + front.value);
            front = front.next;
            size--;

            printQueueEntry();
        }
    }

    public void peak() {
        out.println();
        if (size == 0) {
            out.println("Queue is empty");
        } else {
            out.println("Peak value: " + front.value);
        }
    }

    void printQueueEntry() {
        out.println();
        if (size == 1) {
            out.println("--> " + front.value);
        } else {
            Node currentNode = front;
            while (currentNode != null) {
                out.print("-->" + currentNode.value);
                currentNode = currentNode.next;
            }
        }
    }

}
