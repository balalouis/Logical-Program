package tree;

public class MyTree2023ViaLoop {

    public Node root;
    public MyTree2023ViaLoop(){
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

}
