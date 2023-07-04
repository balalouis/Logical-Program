package tree;

import java.util.ArrayList;

public class UdemyTree {

    public Node root;
    public UdemyTree(){
        root = null;
    }

    public void insert(int value){
        if(root==null){
            Node node = new Node(value);
            root = node;
        }else {
            Node currentNode = root;
            Node newNode = new Node(value);
            while (true){
                if(value < currentNode.value){
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                }else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public void breadthFirstSearchTree(){
        int size = 0;
        int currentPos = 0;
        Node currentNode = root;
        ArrayList<Node> al = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        al.add(root);
        arrayList.add(root.value);
        System.out.println("Array: "+al);
        while (al.size()!=0){
            Node left = currentNode.left;
            Node right = currentNode.right;
            System.out.println("Current node:"+currentNode.value);
            System.out.println("Current Array List:"+arrayList);
            if(left!=null){
//                System.out.println("Value of left: "+left.value);
                al.add(al.size(), left);
                arrayList.add(left.value);
            }
            if(right!=null){
//                System.out.println("Value of right: "+right.value);
                al.add(al.size(), right);
                arrayList.add(right.value);
            }
            al.remove(0);
            if(al.size()!=0) {
                currentNode = al.get(0);
            }
        }
    }
}
