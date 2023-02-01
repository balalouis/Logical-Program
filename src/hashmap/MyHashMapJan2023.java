package hashmap;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashMapJan2023 {
    int size = 0;
    ArrayList<MyObject>[] myArrays;
    public MyHashMapJan2023(int _size){
        size = _size;
        myArrays = new ArrayList[size];
    }

    public void setValue(String key, int value){
        ArrayList arrayList=null;
        Integer address=getHashCode(key);
        if(myArrays[address]==null){
            arrayList = new ArrayList<MyObject>();
            myArrays[address] = arrayList;
        }else {
            arrayList=myArrays[address];
        }
        arrayList.add(new MyObject(key,value));
    }

    public void getValue(String key){
        Integer address=getHashCode(key);
        ArrayList arrayList= myArrays[address];
        for(int i=0;i<arrayList.size();i++){
            MyObject myObject= (MyObject) arrayList.get(i);
            if(key.equals(myObject.key)){
                out.println("-----> "+myObject.value);
                break;
            }
        }
    }

    public void printListItems() {
        for (int i = 0; i < myArrays.length; i++) {
            ArrayList arrayList=myArrays[i];
            out.println("-----> " + arrayList);
        }
    }

    public void getKeys(){
        ArrayList<String> keyList=new ArrayList<>();
        for(int i=0;i< myArrays.length;i++){
            ArrayList al=myArrays[i];
            if(al!=null) {
                MyObject myObject= (MyObject) al.get(0);
                keyList.add(myObject.key);
            }
        }
        out.println("=====> " + keyList);
    }

    public void getKeysCoalition (){
        ArrayList<String> keyList=new ArrayList<>();
        for(int i=0;i< myArrays.length;i++){
            ArrayList al=myArrays[i];
            if(al!=null) {
                for(int j=0;j<al.size();j++){
                    MyObject myObject= (MyObject) al.get(j);
                    keyList.add(myObject.key);
                }
            }
        }
        out.println("=====> " + keyList);
    }

    public void getValues(){
        ArrayList<Integer> valueList=new ArrayList<>();
        for(int i=0;i< myArrays.length;i++){
            ArrayList al=myArrays[i];
            if(al!=null) {
                MyObject myObject= (MyObject) al.get(0);
                valueList.add(myObject.value);
            }
        }
        out.println("=====> " + valueList);
    }

    private Integer getHashCode(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.myArrays.length;
        }
        return hash;
    }
}
