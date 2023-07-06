package tree;

import java.util.ArrayList;

public class MyTree2023ViaLoop {

    public Node root;
    public MyTree2023ViaLoop(){
        root = null;
    }
    public ArrayList<Node> alBfs=new ArrayList<>();
    public void insert(int value){
        Node newNode = new Node(value);
        if(root==null){
            root = newNode;
        }else {
            findPositionToInsert(root, newNode);
        }
    }

    public boolean search(Node currentNode, int value){
        boolean isNodeFound = false;
        while (currentNode!=null){
            if(value==currentNode.value){
                isNodeFound = true;
                break;
            }else if(value < currentNode.value){
                currentNode = currentNode.left;
            }else {
                currentNode = currentNode.right;
            }
        }
        return isNodeFound;
    }

    public void remove(Node currentNode, int value){
        Node prevNode = null;
        while (currentNode!=null){
            if(value==currentNode.value){
                break;
            }else if(value < currentNode.value){
                prevNode = currentNode;
                currentNode = currentNode.left;
            }else {
                prevNode = currentNode;
                currentNode = currentNode.right;
            }
        }
        if(currentNode!=null) {
            if (currentNode.left != null && currentNode.right != null) {
                Node currentLeft = currentNode.left;
                Node currentRight = currentNode.right;
                if (currentNode.value < prevNode.value) {
                    prevNode.left = currentRight;
                    currentRight.left = currentLeft;
                } else {
                    prevNode.right = currentRight;
                    currentRight.left = currentLeft;
                }
            } else if (currentNode.left == null && currentNode.right == null) {
                if (currentNode.value < prevNode.value) {
                    prevNode.left = null;
                } else {
                    prevNode.right = null;
                }
            } else if (currentNode.left != null) {
                currentNode.left = null;
            } else {
                currentNode.right = null;
            }
            traverseTree(root);
        }else {
            System.out.println("No node found");
        }
    }

    private void findPositionToInsert(Node currentNode, Node newNode) {
        while (currentNode!=null){
            if(newNode.value < currentNode.value && currentNode.left==null){
                currentNode.left = newNode;
                break;
            }else if(newNode.value < currentNode.value){
                currentNode = currentNode.left;
            }else if(newNode.value > currentNode.value && currentNode.right==null){
                currentNode.right = newNode;
                break;
            }else if(newNode.value > currentNode.value){
                currentNode = currentNode.right;
            }
        }
    }

    public void traverseTree(Node currentNode){
        if(currentNode.left!=null) {
            traverseTree(currentNode.left);
        }
        System.out.println(""+currentNode.value);
        if(currentNode.right!=null){
            traverseTree(currentNode.right);
        }
    }

    public void startBfsViaRecursion(){
        alBfs.add(root);
        bfsViaRecursion(root);
    }

    public void bfsViaLoop(){
        Node currentNode = root;
        ArrayList<Node> al = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        al.add(root);
        arrayList.add(root.value);
        while (al.size() != 0) {
            Node left = currentNode.left;
            Node right = currentNode.right;
            System.out.println("Current Array List:" + arrayList);
            if (left != null) {
                al.add(al.size(), left);
                arrayList.add(left.value);
            }
            if (right != null) {
                al.add(al.size(), right);
                arrayList.add(right.value);
            }
            al.remove(0);
            if (al.size() != 0) {
                currentNode = al.get(0);
            }
        }
    }

    public void bfsViaRecursion(Node currentNode){
        if(currentNode==null){
            return;
        }
        System.out.print("==> " + currentNode.value);
        if(currentNode.left!=null){
            alBfs.add(currentNode.left);
        }
        if(currentNode.right!=null){
            alBfs.add(currentNode.right);
        }
        alBfs.remove(0);
        if (alBfs.size() > 0) {
            bfsViaRecursion(alBfs.get(0));
        }
    }

    public void dfsInOrder(Node currentNode){
        if(currentNode==null){
            return;
        }
        dfsInOrder(currentNode.left);
        System.out.print(currentNode.value + " ");
        dfsInOrder(currentNode.right);
    }

    public void dfsPreOrder(Node currentNode){
        if(currentNode==null){
            return;
        }
        System.out.print(currentNode.value + " ");
        dfsInOrder(currentNode.left);
        dfsPreOrder(currentNode.right);
    }
}
