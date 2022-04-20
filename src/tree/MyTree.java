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

    public void remove(int value, Node node, Node prevNode, boolean isFromLeft) {
        if (node != null) {
            // Value matched
            if (value == node.value) {
                // matched has left and right as null
                if (prevNode != null && node.left == null && node.right == null) {
                    out.println();
                    if (prevNode.left != null && prevNode.left.value == value) {
                        prevNode.left = null;
                    } else if (prevNode.right != null && prevNode.right.value == value) {
                        prevNode.right = null;
                    }
                    out.print(" Deleted node: " + value);
                } else {
                    // Both left and right has a value
                    if (node.left != null && node.right != null) {
                        out.println("Delete node: " + node.value);
                        Node updatedNode = traverseTillLastLeftNode(node.right);
                        out.println("Update node: " + updatedNode.value);

                        if (isFromLeft) {
                            Node immePrevNode = traverseTillPrevNode(node.right);
                            out.println("Imm Prev: " + immePrevNode.value);
                            Node createNode = new Node(updatedNode.value);
                            createNode.left = node.left;
                            if (updatedNode.value == node.right.value) {
                                createNode.right = null;
                            } else {
                                createNode.right = node.right;
                                immePrevNode.left = null;
                            }
                            prevNode.left = createNode;
                        } else {
                            if (updatedNode.value == node.right.value) {
                                updatedNode.left = node.left;
                                prevNode.right = updatedNode;
                            } else {
                                traverseTillPrevNode(node.right).left = null;
                                Node createNode = new Node(updatedNode.value);
                                createNode.left = node.left;
                                createNode.right = node.right;
                                prevNode.right = createNode;
                            }
                        }
                    } else if (node.left != null) {
                        // Left has a value but right have not a value
                        out.println("Prev node: " + prevNode.value);
                        out.println("Deleted node: " + node.value);

                        if (isFromLeft) {
                            prevNode.left = node.left;
                        } else {
                            prevNode.right = node.left;
                        }
                    } else if (node.right != null) {
                        // Right has a value but left have not a value
                        out.println("Prev node: " + prevNode.value);
                        out.println("Deleted node: " + node.value);

                        if (isFromLeft) {
                            prevNode.left = node.right;
                        } else {
                            prevNode.right = node.right;
                        }
                    }
                }
            } else if (value < node.value) {
                // Value not yet matched and search value is less than current node value
                prevNode = node;
                node = node.left;
                isFromLeft = true;
                remove(value, node, prevNode, isFromLeft);
            } else {
                // Value not yet matched and search value is greater than current node value
                prevNode = node;
                node = node.right;
                isFromLeft = false;
                remove(value, node, prevNode, isFromLeft);
            }
        }
    }

    public Node traverseTillLastLeftNode(Node node) {
        Node updateNode = null;
        while (node != null) {
            updateNode = node;
            node = node.left;
        }
        return updateNode;
    }

    public Node traverseTillPrevNode(Node node) {
        Node prevNode = null;
        while (node != null) {
            if (node.left != null) {
                prevNode = node;
            }
            node = node.left;
        }
        return prevNode;
    }

    public void search(int value, Node node) {
        if (node != null) {
            if (value == node.value) {
                out.print(" --> Value found: " + value);
            } else if (value < node.value) {
                out.print("-->" + node.value);
                node = node.left;
                search(value, node);
            } else {
                out.print("-->" + node.value);
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
