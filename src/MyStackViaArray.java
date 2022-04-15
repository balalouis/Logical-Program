import java.util.Arrays;

import static java.lang.System.out;

public class MyStackViaArray {

    private int[] myArray;
    private int top;
    private int size;

    MyStackViaArray(int size) {
        this.size = size;
        myArray = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (size - 1 == top) {
            out.println("Stack is fulled");
        } else {
            myArray[++top] = value;
        }
        printStack();
    }

    public void pop() {
        if (!isEmpty()) {
            int poppedValue = myArray[top];
            top--;
            out.println("Popped value: " + poppedValue);
        } else {
            out.println("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (isEmpty()) {
            out.println("Stack is empty");
            return -1;
        } else {
            return myArray[top];
        }
    }

    private void printStack() {
        out.println("----> " + Arrays.toString(myArray));
    }
}
