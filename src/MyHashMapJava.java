import java.util.ArrayList;
import java.util.Arrays;

public class MyHashMapJava {
    int size = 0;
    ArrayList[] myArrays;

    MyHashMapJava(int size) {
        this.size = size;
        myArrays = new ArrayList[size];
    }

    void printListItems() {
        for (int i = 0; i < myArrays.length; i++) {
            System.out.println("-----> " + myArrays[0]);
        }
    }

    void getValue(String key) {
        int address = getHashCode(key);
        System.out.println("Address:" + address);
        ArrayList arrayList = myArrays[address];
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("----> " + arrayList.get(i));
        }
        String value = myArrays[address].get(address).toString();
        System.out.println("" + value);
    }

    void setDummy(String key, String value) {
        int address = getHashCode(key);
        MyObject[] myObjects = new MyObject[20];
        if (myObjects[address] == null) {
            myObjects[address] = new MyObject(key, value);
        }
    }

    void setValue(String key, String value) {
        int address = getHashCode(key);
        if (myArrays[address] == null) {
            myArrays[address] = new ArrayList<String>();
        }
        myArrays[address].add(value);
        System.out.println("" + Arrays.toString(myArrays));
    }

    Integer getHashCode(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.myArrays.length;
        }
        return hash;
    }
}