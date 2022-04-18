import array.LogicalProgramInArray;
import array.MyArray;
import company.PicsArt;
import company.TCS;
import hashmap.LogicalProgramInHashMap;
import hashmap.MyHashMapJava;
import linkedlist.DoubleLinkedList;
import linkedlist.MySingleLinkList;
import queue.MyQueueViaArray;
import queue.MyQueueViaLinkedList;
import stack.MyStackViaArray;
import stack.MyStackViaLinkedList;
import tree.MyTree;

import static java.lang.System.out;

public class LogicalProgram {

    public static void main(String[] args) {
        picsArt();
    }

    private static void myArray() {
        MyArray myArray = new MyArray();
        myArray.printData();

        myArray.pushItem("A");
        myArray.pushItem("B");
        myArray.pushItem("C");
        myArray.pushItem("D");
        myArray.pushItem("E");
        myArray.pushItem("F");
        myArray.delete(4);
    }

    private static void logicalPrograms() {
        LogicalProgramInArray logicalProgram = new LogicalProgramInArray();
        logicalProgram.findSumOfConsecutiveDigitIsEqualToGivenNUmber();
    }

    private static void myHashMap() {
        MyHashMap myHashMap = new MyHashMap(2);
        myHashMap.setValue("Arun", "Salem");
        myHashMap.setValue("Deva", "Chennai");
        myHashMap.setValue("Vivek", "Andhra");

        out.println("Value is : " + myHashMap.getValue("Vivek"));

        myHashMap.printKeyList(myHashMap.getKeyList());
    }

    private static void myHashMapJava() {
        MyHashMapJava myHashMapJava = new MyHashMapJava(2);

        myHashMapJava.setValue("Arun", "Salem");
        myHashMapJava.setValue("Deva", "Chennai");
        myHashMapJava.setValue("Vivek", "Andhra");

        myHashMapJava.getValue("Vivek");
    }

    private static void logicalProgramInHashMap() {
        LogicalProgramInHashMap logicalProgramInHashMap = new LogicalProgramInHashMap();
        logicalProgramInHashMap.findFirstRepeatedItemsViaArray();
    }

    private static void logicalProgramFromHackerathon() {
        TCS TCS = new TCS();
        long lowCost = TCS.findMinCost();
        out.println("Lower cost: " + lowCost);
    }

    private static void mySingleLinkList() {
        MySingleLinkList mySingleLinkList = new MySingleLinkList(10);
        mySingleLinkList.append(7);
        mySingleLinkList.append(15);
        mySingleLinkList.append(23);
        mySingleLinkList.append(42);

        mySingleLinkList.deleteNodeByPosition(0);
    }

    private static void myDoubleLinkedList() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(2);
        doubleLinkedList.append(4);
        doubleLinkedList.append(6);
        doubleLinkedList.append(8);

        doubleLinkedList.reverse();
    }

    private static void myStackViaLinkedList() {
        MyStackViaLinkedList myStackViaLinkedList = new MyStackViaLinkedList(1);
        myStackViaLinkedList.push(2);
        myStackViaLinkedList.push(3);
        myStackViaLinkedList.push(4);

        myStackViaLinkedList.pop();
        myStackViaLinkedList.pop();
        myStackViaLinkedList.push(6);
        myStackViaLinkedList.push(8);
        myStackViaLinkedList.peek();
    }

    private static void myStackViaArray() {
        MyStackViaArray myStackViaArray = new MyStackViaArray(4);
        myStackViaArray.push(100);
        myStackViaArray.push(200);
        myStackViaArray.push(300);
        myStackViaArray.pop();
        myStackViaArray.push(500);
        myStackViaArray.push(600);
    }

    private static void myQueueViaLinkedList() {
        MyQueueViaLinkedList myQueueViaLinkedList = new MyQueueViaLinkedList(2);
        myQueueViaLinkedList.push(4);
        myQueueViaLinkedList.push(6);
        myQueueViaLinkedList.push(8);

        myQueueViaLinkedList.pop();
        myQueueViaLinkedList.pop();
        myQueueViaLinkedList.push(12);
        myQueueViaLinkedList.pop();
        myQueueViaLinkedList.peak();
    }

    private static void myQueueViaArray() {
        MyQueueViaArray myQueueViaArray = new MyQueueViaArray(4);
        myQueueViaArray.enQueue(2);
        myQueueViaArray.enQueue(4);

        myQueueViaArray.deQueue();
        myQueueViaArray.enQueue(6);
        myQueueViaArray.enQueue(8);
        myQueueViaArray.enQueue(10);
        myQueueViaArray.enQueue(12);
    }

    private static void tcs() {
        TCS tcs = new TCS();
        out.println("Min cost :" + tcs.findMinCost());
    }

    private static void picsArt() {
        PicsArt picsArt = new PicsArt();
//        picsArt.programTwo("abbaaaac");
        picsArt.programOne();
    }

    private static void tree() {
        MyTree myTree = new MyTree(9);
        myTree.insert(4);
        myTree.insert(6);
        myTree.insert(20);
        myTree.insert(70);
        myTree.insert(15);
        myTree.insert(2);

        myTree.printNodes(myTree.root);
        out.println();
        myTree.search(15, myTree.root);
    }
}
