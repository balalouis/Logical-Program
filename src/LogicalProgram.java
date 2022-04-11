public class LogicalProgram {

    public static void main(String[] args) {
        myLinkedList();
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
        logicalProgram.moveZeros();
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

    private static void myLinkedList() {
        MyLinkList myLinkList = new MyLinkList(10);
        myLinkList.append(7);
        myLinkList.append(15);
        myLinkList.append(23);
        myLinkList.append(42);

        myLinkList.deleteNodeByPosition(0);
    }
}
