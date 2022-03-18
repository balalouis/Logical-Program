import java.util.ArrayList;

public class LogicalProgramInArray {

    static char[] characters = {'a', 'b', 'c', 'd'};

    public void findSumOfConsecutiveDigitIsEqualToGivenNUmber() {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int givenNUmber = 15;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num.length - 1; i++) {
            int sum = 0;
            int startPos = 0;
            for (int j = i; j < num.length - 1; j++) {
                if (i == j) {
                    startPos = i;
                    sum = num[j] + num[j + 1];
                } else {
                    sum = sum + num[j + 1];
                }
                if (sum == givenNUmber) {
                    int endPos = j + 1;
                    System.out.println(" Start Pos: " + ++startPos + " End Pos: " + ++endPos);
                    arrayList.add(startPos+1);
                    arrayList.add(endPos);
                }
            }
        }
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
