package tree;

public class MyTree2023ViaRecursion {

    public Node root;
    public MyTree2023ViaRecursion(){
        root = null;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(root==null){
            root = newNode;
        }else {
            findPositionToInsert(root, newNode);
        }
    }

    public void lookup(int value){
        if(root==null){
            System.out.println("There is no node");
        }else {
            boolean nn=search(root,value,true);
            System.out.println("==> "+nn);
        }
    }

    boolean search(Node currentNode,int value, boolean isNodeFound){
        if(currentNode!=null) {
            if (currentNode.value == value) {
                isNodeFound = true;
                System.out.println("Node found");
            } else if (value < currentNode.value) {
                isNodeFound = search(currentNode.left, value, isNodeFound);
            } else {
                isNodeFound = search(currentNode.right, value, isNodeFound);
            }
        }else {
            isNodeFound = false;
            System.out.println("Node not found");
        }
        return isNodeFound;
    }

    public void  removeFromTree(int value){
        Node prevNode = null;
        remove(root,prevNode, value);
    }

    public Node remove(Node currentNode, Node prevNode,int value){
        if(currentNode!=null) {
            if (currentNode.value == value) {
                System.out.println("Node found");
                removeNodeFromTree(currentNode,prevNode,value);

            } else if (value < currentNode.value) {
                prevNode = currentNode;
                currentNode = remove(currentNode.left,prevNode, value);
            } else {
                prevNode = currentNode;
                currentNode = remove(currentNode.right,prevNode, value);
            }
        }else {
            System.out.println("Node not found");
        }

        return currentNode;
    }

    void removeNodeFromTree(Node removeNode, Node prevNode, int value){
        if(removeNode.left!=null && removeNode.right!=null){
            Node leftNode = removeNode.left;
            Node rightNode = removeNode.right;
            if(value < prevNode.value){
                rightNode.left = leftNode;
                prevNode.left = rightNode;
            }else {
                prevNode.right = rightNode;
                rightNode.left = leftNode;
            }
        }else if(removeNode.left != null){
            if(value < prevNode.value){
                prevNode.left = removeNode.left;
            }else {
                prevNode.right = removeNode.left;
            }
        }else if(removeNode.right !=null){
            if(value < prevNode.value){
                prevNode.left = removeNode.right;
            }else {
                prevNode.right = removeNode.right;
            }
        }else {
            if(value< prevNode.value){
                prevNode.left = null;
            }else {
                prevNode.right = null;
            }
        }
        traverseTree(root);
    }

    public void findPositionToInsert(Node current_node, Node newNode){
        if(current_node!=null && newNode.value < current_node.value){
                if(current_node.left!=null){
                    findPositionToInsert(current_node.left, newNode);
                }else {
                    current_node.left = newNode;
                }
        }else if(current_node!=null && newNode.value > current_node.value) {
            if(current_node.right!=null){
                findPositionToInsert(current_node.right,newNode);
            }else {
                current_node.right = newNode;
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

}
