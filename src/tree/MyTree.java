package tree;

import static java.lang.System.out;

public class MyTree {

    public Node root;
    int size;

    public MyTree(int value) {
        root = new Node(value);
        size = 1;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        Node currentRoot = root;
        Node parentNode = null;
        boolean isLeft = false;

        while (currentRoot != null) {
            if (value > currentRoot.value) {
                isLeft = false;
                parentNode = currentRoot;
                currentRoot = currentRoot.right;
            } else {
                isLeft = true;
                parentNode = currentRoot;
                currentRoot = currentRoot.left;
            }
        }
        if (isLeft) {
            parentNode.left = newNode;
        } else {
            parentNode.right = newNode;
        }
    }

    public void search(int value, Node node) {
        if (node != null) {
            if (value == node.value) {
                out.print(" --> Value found: " + value);
            } else if (value < node.value) {
                out.print("-->"+node.value);
                node = node.left;
                search(value, node);
            } else {
                out.print("-->"+node.value);
                node = node.right;
                search(value, node);
            }
        }
    }

    public void printNodes(Node node) {
        Node prevParentNode = null;
        if (node != null) {
            prevParentNode = node;
            node = node.left;
            printNodes(node);
        }

        if (prevParentNode != null) {
            out.print("-->" + prevParentNode.value);
        }

        if (prevParentNode != null) {
            prevParentNode = prevParentNode.right;
            printNodes(prevParentNode);
        }

    }
}
