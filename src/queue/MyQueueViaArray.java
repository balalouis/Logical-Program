package queue;

import java.util.Arrays;

import static java.lang.System.out;

public class MyQueueViaArray {

    int[] myQueue;
    int size = 0;
    int currPoss = -1;

    public MyQueueViaArray(int size) {
        this.size = size;
        myQueue = new int[size];
    }

    public void enQueue(int value) {
        if (currPoss == size - 1) {
            out.println("Queue is full");
        } else {
            currPoss = currPoss + 1;
            myQueue[currPoss] = value;
            printQueue();
        }
    }

    public void deQueue() {
        if (currPoss < 0) {
            out.println("No item in Queue");
        } else {
            out.println("Dequeue item: " + myQueue[0]);
            for (int i = 0; i < currPoss; i++) {
                myQueue[i] = myQueue[i + 1];
            }
            myQueue[currPoss] = 0;
            currPoss--;
            printQueue();
        }
    }

    private void printQueue() {
        out.println("----> " + Arrays.toString(myQueue));
    }

}
