import java.util.ArrayList;

import static java.lang.System.out;

public class LogicalProgramInHashMap {

    public void findFirstRepeatedItemsViaHashmap() {
        int[] numArray = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        ArrayList<String> al = new ArrayList<>();

        for (int i : numArray) {
            if (al.contains(String.valueOf(i))) {
                out.println("First repeated item is: " + i);
                break;
            } else {
                al.add(String.valueOf(i));
            }
            out.println("-----> " + al);
        }
    }

    public void findFirstRepeatedItemsViaArray() {
//        char[] charArray = {'b', 'e', 'a', 'b', 'c', 'e', 'a', 'b', 'd'};
        char[] charArray = {'b', 'a', 'a', 'b', 'c', 'e', 'a', 'b', 'd'};
        boolean repeatedItemSeen = false;
        for (int i = 0, jumpPos = 1; i < charArray.length / 2; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (jumpPos + j < charArray.length) {
                    if (charArray[j] == charArray[j + jumpPos]) {
                        out.println("-----> Item seen: " + charArray[j]);
                        repeatedItemSeen = true;
                        break;
                    }
                }
            }
            if (repeatedItemSeen) {
                break;
            }
            jumpPos++;
        }
    }

}
