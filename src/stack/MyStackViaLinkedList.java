package stack;

import static java.lang.System.out;

public class MyStackViaLinkedList {

    Node top;
    Node bottom;
    int size;

    public MyStackViaLinkedList(int value) {
        Node newNode = new Node(value);
        top = newNode;
        bottom = newNode;
        size = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        printStackEntry();
    }

    public void pop() {
        out.println();
        if (size == 0) {
            out.println("There is no item in stack");
        } else if (size == 1) {
            printValue(top.value);
            top = null;
            bottom = null;
            size = 0;
        } else {
            Node poppedNode = top;
            printValue(poppedNode.value);
            top = top.next;
            size--;
        }
        printStackEntry();
    }

    void printValue(int value) {
        out.println("Item popped from stack: -> " + value);
    }

    public void peek() {
        out.println();
        if (size == 0) {
            out.println("There is no iem is stack");
        } else {
            out.println("Stack peek value : " + top.value);
        }
    }

    void printStackEntry() {
        out.println();
        if (size == 1) {
            out.println("--> " + top.value);
        } else {
            Node currentNode = top;
            while (currentNode != null) {
                out.print("-->" + currentNode.value);
                currentNode = currentNode.next;
            }
        }
    }
}
