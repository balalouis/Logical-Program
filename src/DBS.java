import java.util.HashMap;

import static java.lang.System.out;

public class DBS {

    public void getUniqueCharacterCount() {
        String inputString = "DBS live more, Bank less";

        char[] charString = inputString.toCharArray();
        HashMap<String, String> hashMap = new HashMap<>();

        for (char value : charString) {
            if (value != ' ' && value != ',') {
                if (!hashMap.containsKey(String.valueOf(value))) {
                    hashMap.put(String.valueOf(value), "");
                }
            }
        }

        out.print("Unique Character Count: " + hashMap.size());

    }

}
