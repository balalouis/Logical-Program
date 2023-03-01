package stack;

public class MyStackViaLinkedListJan2023 {

    int size;
    NodeForStack head;
    NodeForStack tail;

    public MyStackViaLinkedListJan2023(){
        size=0;
        head = null;
        tail = null;
    }

    public void peek(){
        if(head==null){
            System.out.println("There is no item");
        }else {
            System.out.println("Peeked value is "+head.value);
        }
    }

    public void push(int value){
        NodeForStack newNode=new NodeForStack(value);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void pop(){
        if(head==null){
            System.out.println("No item in stack");
        }else {
            head=head.next;
            size--;
        }
    }

    public void print(){
        NodeForStack node = head;
        while (node!=null){
            System.out.print("--> "+node.value);
            node = node.next;
        }
    }
}

class NodeForStack{
    int value;
    NodeForStack next;
    NodeForStack(int value){
        this.value = value;
        next = null;
    }
}
