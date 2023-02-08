package linkedlist;

public class DoubleLinkedListJan2023 {
    DoubleNode head;
    DoubleNode tail;
    int length;
    public DoubleLinkedListJan2023(int value){
        DoubleNode doubleNode=new DoubleNode(value);
        head = doubleNode;
        tail = doubleNode;
        length++;
    }

    public void append(int value){
        DoubleNode newNode=new DoubleNode(value);
        newNode.prev = head;
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value){
        DoubleNode newNode=new DoubleNode(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
    }

    public void printDoubleLinkedList(){
        System.out.println();
        DoubleNode currentNode = head;
        System.out.print("Head ==> "+head.value);
        while (currentNode.next!=null){
            currentNode = currentNode.next;
            System.out.print(" ==> "+currentNode.value);
        }
    }
}
