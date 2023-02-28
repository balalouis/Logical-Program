package linkedlist;

import static java.lang.System.out;

public class SingleLinkedListJan2023 {
    public SingleNode head;
    SingleNode tail;
    int length;

    public SingleLinkedListJan2023(int value){
        head=new SingleNode(value);
        tail = head;
        length=1;
    }

    public void append(int value){
        SingleNode newNode=new SingleNode(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value){
        SingleNode newNode=new SingleNode(value);
        newNode.next = head;
        head = newNode;
        length++;
        out.println("Length: "+length);
    }

    public void insert(int index, int value){
        SingleNode newNode=new SingleNode(value);
        if(index==0){
            prepend(value);
            length++;
            return;
        }

        if(index==length){
            append(value);
            length++;
            return;
        }

        SingleNode currentNode = head;
        SingleNode prevNode = null;
        int currentIndex =0;
        while(currentNode!=null){
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
            if(currentIndex==index){
                break;
            }
        }
        assert currentNode != null;
        prevNode.next = newNode;
        newNode.next = currentNode;
        length++;
    }

    public void remove(int index){
        if(index==0){
            head = head.next;
            length--;
            return;
        }

        SingleNode currentNode = head;
        SingleNode prevNode =null;
        int currentIndex =0;
        out.println();
        while (currentNode.next!=null){
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
            if(currentIndex==index){
                break;
            }
        }
        assert prevNode != null;
        prevNode.next = currentNode.next;
        length--;

    }

    public void reverse(SingleNode singleNode){
        if (singleNode.next != null) {
            reverse(singleNode.next);
        }
        out.println("Value: "+singleNode.value);
    }

    public void printNode(){
        out.println("============================================");
        SingleNode currentNode = head;
        out.print("Head ==>"+currentNode.value);
        while(currentNode.next!=null){
            currentNode = currentNode.next;
            out.print("==> "+currentNode.value);
        }
        out.println();
    }

}
