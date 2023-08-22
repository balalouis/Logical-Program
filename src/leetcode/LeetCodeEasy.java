package leetcode;

import java.util.ArrayList;

public class LeetCodeEasy {
    public boolean isPalindrome(int x) {
        char ss[] = String.valueOf(x).toCharArray();
        boolean isPalindrome = true;
        for (int front = 0, back = ss.length - 1; front < ss.length / 2; front++, back--) {
            if (ss[front] != ss[back]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
