package hashmap;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashMapJan2023 {
    int size = 0;
    ArrayList[] myArrays;
    public MyHashMapJan2023(int _size){
        size = _size;
        myArrays = new ArrayList[size];
    }

    public void setValue(String key, String value){
        ArrayList<String> arrayList=null;
        Integer address=getHashCode(key);
        if(myArrays[address]==null){
            arrayList = new ArrayList<>();
            myArrays[address] = arrayList;
        }else {
            arrayList=myArrays[address];
        }
        arrayList.add(value);
        System.out.println("" + Arrays.toString(myArrays));
    }

    public void getValue(String key){
        Integer address=getHashCode(key);
        ArrayList arrayList= myArrays[address];
        for(int i=0;i<arrayList.size();i++){
            System.out.println("-----> "+arrayList.get(i));
        }
    }

    public Integer getHashCode(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.myArrays.length;
        }
        return hash;
    }
}
