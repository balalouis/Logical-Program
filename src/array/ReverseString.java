package array;

import static java.lang.System.out;

public class ReverseString {

    public void reverseString(String text) {
        out.println("Input: "+ text);
        char[] charArray = text.toCharArray();
        for (int start = 0, end = charArray.length-1; start < charArray.length/ 2; start++,end--) {
            char temp = text.charAt(start);
            charArray[start] = charArray[end];
            charArray[end] = temp;
        }
        out.println("Output: "+ String.valueOf(charArray));
    }

}
