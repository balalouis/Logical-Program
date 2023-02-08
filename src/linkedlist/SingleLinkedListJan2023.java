package linkedlist;

public class SingleLinkedListJan2023 {
    SingleNode head;
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
        System.out.println("Length: "+length);
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
        System.out.println();
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

    public void printNode(){
        System.out.println("============================================");
        SingleNode currentNode = head;
        System.out.print("Head ==>"+currentNode.value);
        while(currentNode.next!=null){
            currentNode = currentNode.next;
            System.out.print("==> "+currentNode.value);
        }
        System.out.println();
    }

}
