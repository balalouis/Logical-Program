public class LogicalProgram {

    static char[] characters = {'a', 'b', 'c', 'd'};

    static int[] num = {1, 2, 3, 4};

    public static void main(String[] args) {
        printPairOfSums(num);
    }

    public static void printPairOfArrays(char[] characters) {
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters.length; j++) {
                if (i != j) {
                    System.out.println(characters[i] + "," + characters[j]);
                }
            }
            System.out.println();
        }
    }

    private static void printPairOfSums(int[] num) {
        for (int k : num) {
            for (int i : num) {
                int sum = k + i;
                System.out.print(sum + ", ");
            }
            System.out.println();
        }
    }
}
