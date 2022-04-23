package graph;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.out;

public class Graph {

    private final ArrayList<Integer> vertexList = new ArrayList();
    private final HashMap<Integer, ArrayList<Integer>> edgeMap = new HashMap<>();

    public void addVertex(int value) {
        vertexList.add(value);
    }

    public void addEdge(int vertexOne, int vertexTwo) {
        ArrayList<Integer> alOne;
        if (edgeMap.containsKey(vertexOne)) {
            alOne = edgeMap.get(vertexOne);
            alOne.add(vertexTwo);
        } else {
            alOne = new ArrayList<>();
            alOne.add(vertexTwo);
        }
        edgeMap.put(vertexOne, alOne);

        ArrayList<Integer> alTwo;
        if (edgeMap.containsKey(vertexTwo)) {
            alTwo = edgeMap.get(vertexTwo);
            alTwo.add(vertexOne);
        } else {
            alTwo = new ArrayList<>();
            alTwo.add(vertexOne);
        }
        edgeMap.put(vertexTwo, alTwo);
    }

    public void showConnectionOfVertex() {
        for (Integer key : edgeMap.keySet()) {
            out.println("Key: " + key + " - Value: " + edgeMap.get(key));
        }
    }

    public void printVertex() {
        out.println();
        for (int value : vertexList) {
            out.println("Vertex: " + value);
        }
    }
}
