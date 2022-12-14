package array;

import static java.lang.System.out;

import java.util.Arrays;

public class MyArrayDec {
    int length =0;
    String[] nameArr=new String[10];

    public void printNameArray(){
        out.println(Arrays.toString(nameArr));
    }

    public void push(String item){
        nameArr[length] = item;
        length++;
    }

    public void pop(){
        nameArr[length-1] = null;
        length--;
    }

    public void insert(int position, String item){
        for(int i=nameArr.length-1;i>=position;i--){
            if(i<nameArr.length-1) {
                nameArr[i + 1] = nameArr[i];
            }
        }
        nameArr[position] = item;
        length++;
    }

    public void delete(int position){
        for(int i=position;i<length;i++){
            nameArr[i]=nameArr[i+1];
        }
        length--;
    }

}
