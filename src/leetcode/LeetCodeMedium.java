package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCodeMedium {

    /*
            Given a string s, find the length of the longest substring without repeating characters.
            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.
     */
    public int lengthOfLongestSubstring(String s) {
        char[] charValue = s.toCharArray();
        HashMap<String, Integer> hashMap = new HashMap<>();
//        if (s.isEmpty()) {
//            return 0;
//        } else if (s.isBlank() || s.length() == 1) {
//            return 1;
//        }
//        for (int i = 0; i < charValue.length; i++) {
//            ArrayList<String> arrayList = new ArrayList<>();
//            for (int j = i; j < charValue.length; j++) {
//                char c = charValue[j];
//                if (arrayList.contains(String.valueOf(c))) {
//                    break;
//                } else {
//                    arrayList.add(String.valueOf(c));
//                }
//            }
//            if (arrayList.size() == charValue.length) {
//                String key = convertListToString(arrayList);
//                hashMap.put(key, key.length());
//                break;
//            } else {
//                String key = convertListToString(arrayList);
//                hashMap.put(key, key.length());
//            }
//        }
        return findMaxSubString(hashMap);
    }

    int findMaxSubString(HashMap<String, Integer> hashMap) {
        int maxCount = 0;
        for (String key : hashMap.keySet()) {
            int currValue = hashMap.get(key);
            if (currValue > maxCount) {
                maxCount = currValue;
            }
        }
        return maxCount;
    }

    String convertListToString(ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arrayList) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
