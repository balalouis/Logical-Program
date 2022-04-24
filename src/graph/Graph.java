package graph;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.out;

public class Graph {

    private final ArrayList<Integer> vertexList = new ArrayList();
    private final HashMap<Integer, ArrayList<Integer>> edgeMap = new HashMap<>();

    public void addVertex(int value) {
        edgeMap.put(value, new ArrayList<>());
    }

    public void addEdge(int vertexOne, int vertexTwo) {
        edgeMap.get(vertexOne).add(vertexTwo);
        edgeMap.get(vertexTwo).add(vertexOne);
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
