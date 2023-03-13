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

    public void remove(int value){

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
