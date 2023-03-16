package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphJan2013 {

    private ArrayList<Integer> vertexList;
    private HashMap<Integer, ArrayList<Integer>> edgeMap;
    public GraphJan2013(){
        vertexList =new ArrayList<>();
        edgeMap = new HashMap<>();
    }

    public void addVertex(int value){
        vertexList.add(value);
    }

    public void addEdge(int valueOne, int valueTwo){
        ArrayList<Integer> alOne;
        ArrayList<Integer> alTwo;
        if(edgeMap.containsKey(valueOne)){
            alOne=edgeMap.get(valueOne);
        }else {
            alOne=new ArrayList<>();
        }
        alOne.add(valueTwo);
        edgeMap.put(valueOne,alOne);

        if(edgeMap.containsKey(valueTwo)){
            alTwo = edgeMap.get(valueTwo);
        }else {
            alTwo = new ArrayList<>();
        }
        alTwo.add(valueOne);
        edgeMap.put(valueTwo,alTwo);
    }

    public void showConnection(){
        for (Integer key : edgeMap.keySet()) {
            ArrayList<Integer> al=edgeMap.get(key);
            System.out.println("Key: "+key +" -----> Value is: "+al);
        }
    }
}
