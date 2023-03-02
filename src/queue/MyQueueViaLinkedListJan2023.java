package queue;

public class MyQueueViaLinkedListJan2023 {
    int size;
    NodeForQueue head;
    NodeForQueue tail;
    public MyQueueViaLinkedListJan2023(){
        size=0;
    }

    public void enqueue(int value){
        NodeForQueue newNode=new NodeForQueue(value);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else {
            NodeForQueue currentNode = head;
            NodeForQueue prevNode = null;
            while (currentNode!=null){
                prevNode = currentNode;
                currentNode=currentNode.next;
            }
            assert false;
            prevNode.next = newNode;
        }
        size++;
    }

    public void dequeue(){
        System.out.println();
        if(head==null){
            System.out.println("There is no item in queue");
        }else {
            if(head.next==null) {
                head=null;
            }else {
                head=head.next;
            }
            size--;
        }
    }

    public void print(){
        System.out.println();
        if(head==null){
            System.out.println("No item in queue");
        }else {
            NodeForQueue currentNode = head;
            while (currentNode!=null){
                System.out.print("==> "+currentNode.value);
                currentNode = currentNode.next;
            }
        }
    }
}


class NodeForQueue{
    int value;
    NodeForQueue next;
    NodeForQueue(int value){
        this.value = value;
        next = null;
    }
}
