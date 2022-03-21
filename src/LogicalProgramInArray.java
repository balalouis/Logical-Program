import java.util.*;

public class LogicalProgramInArray {

    static char[] characters = {'a', 'b', 'c', 'd'};

    public void findMaxRepeatedElementInArray() {
        char[] characters = {'a', 'c', 'b', 'c', 'd', 'b', 'a', 'b', 'b', 'b'};
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        for (char character : characters) {
            String key = String.valueOf(character);
            if (hashtable.containsKey(key)) {
                int value = hashtable.get(key) + 1;
                hashtable.put(key, value);
            } else {
                hashtable.put(key, 1);
            }
        }

        Set<String> mySet = hashtable.keySet();
        String maxRepeatedKey = "";
        int maxValue = 0;
        for (String key : mySet) {
            if (maxValue < hashtable.get(key)) {
                maxValue = hashtable.get(key);
                maxRepeatedKey = key;
            }
        }
        System.out.println("Key: " + maxRepeatedKey + " Value is: " + hashtable.get(maxRepeatedKey));
    }

    public void reverseTheArray() {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before: " + Arrays.toString(num));
        int halfOfTheArraySize = num.length / 2;
        int temp = 0;
        for (int front = 0, back = num.length - 1; front < halfOfTheArraySize; front++, back--) {
            temp = num[front];
            num[front] = num[back];
            num[back] = temp;
        }
        System.out.println("After: " + Arrays.toString(num));
    }

    public void findSumOfConsecutiveDigitIsEqualToGivenNUmber() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
                    arrayList.add(startPos + 1);
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
