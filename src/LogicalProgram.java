import array.LogicalProgramInArray;
import array.MyArray;
import company.PicsArt;
import company.TCS;
import hashmap.LogicalProgramInHashMap;
import hashmap.MyHashMapJava;
import linkedlist.DoubleLinkedList;
import linkedlist.MySingleLinkList;
import stack.MyStackViaArray;
import stack.MyStackViaLinkedList;

public class LogicalProgram {

    public static void main(String[] args) {
        myStackViaArray();
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

        System.out.println("Value is : " + myHashMap.getValue("Vivek"));

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
        System.out.println("Lower cost: " + lowCost);
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

    private static void company() {
        PicsArt picsArt = new PicsArt();
        picsArt.programTwo("abbaaaac");
    }
}
