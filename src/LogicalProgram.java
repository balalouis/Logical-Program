import company.PicsArt;

public class LogicalProgram {

    public static void main(String[] args) {
        company();
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
        HackerRank hackerRank = new HackerRank();
        long lowCost = hackerRank.findMinCost();
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

    private static void myStack() {
        MyStack myStack = new MyStack(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        myStack.pop();
        myStack.pop();
        myStack.push(6);
        myStack.push(8);
        myStack.peek();
    }

    private static void company() {
        PicsArt picsArt=new PicsArt();
        picsArt.programTwo("abbaaaac");
    }
}
