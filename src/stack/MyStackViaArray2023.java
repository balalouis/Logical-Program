package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStackViaArray2023 {

    ArrayList<Integer> arrayList;
    int size;

    public MyStackViaArray2023(){
        arrayList= new ArrayList<>();
        size =0;
    }

    public void push(int value){
        arrayList.add(size,value);
        size++;
    }

    public void pop(){
        if(size!=0) {
            size--;
            arrayList.remove(size);
        }else {
            System.out.println("There is no item is list");
        }
    }

    public void peak(){
        System.out.println("Peeked value is "+arrayList.get(size));
    }

    public void print(){
        if(size!=0) {
            System.out.println("Value: " + arrayList);
        }else {
            System.out.println("There is no item is list");
        }
    }

}
