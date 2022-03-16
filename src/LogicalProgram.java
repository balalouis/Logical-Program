public class LogicalProgram {

    static char[] characters = {'a', 'b', 'c', 'd'};

    public static void main(String[] args) {
        printPairOfArrays(characters);
    }

    public static void printPairOfArrays(char[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i != j) {
                    System.out.println(num[i] + "," + num[j]);
                }
            }
            System.out.println();
        }
    }
}
