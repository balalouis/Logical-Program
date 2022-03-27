import java.util.ArrayList;

public class MyArray {

    String[] data;
    int length;

    MyArray() {
        data = new String[10];
        length = 0;
    }

    void printData() {
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                System.out.println(data[i]);
            }
        } else {
            System.out.println("There is no item in the array");
        }
    }

    void pushItem(String item) {
        data[length] = item;
        length++;
    }

    void popItem() {
        if (length > 0) {
            String item = data[length - 1];
            data[length] = null;
            length--;
            System.out.println(item + ": deleted from the array");
        } else {
            System.out.println("There is no item in the array");
        }
    }

    void insertItem(int indexPos, String item) {
        if (length == 0) {
            pushItem(item);
        } else {
            shiftsToRight(indexPos, item);
        }
    }

    void shiftsToRight(int indexPos, String item) {
        for (int i = length - 1; i >= indexPos; i--) {
            data[i + 1] = data[i];
        }
        length++;
        data[indexPos] = item;
        printData();
    }

    void delete(int indexPos) {
        if (length == 0) {
            System.out.println("Empty array");
        } else {
            shiftsToLeft(indexPos);
        }
    }

    void shiftsToLeft(int indexPos) {
        for (int i = indexPos; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[length] = null;
        length--;
        printData();
    }
}
