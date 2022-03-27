public class LogicalProgram {

    public static void main(String[] args) {
     myArray();
    }

    private static void myArray(){
        MyArray myArray=new MyArray();
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
        logicalProgram.findSumOfTwoDigitSubArrayEqualsToGivenNumberBigO();
    }

}
