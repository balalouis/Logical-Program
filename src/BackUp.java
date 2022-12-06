import java.util.ArrayList;
import java.util.HashMap;

public class BackUp {

    private static boolean isValidParenthesis(String s) {
        boolean isValid = false;

        ArrayList<String> closingBracketList = new ArrayList<>();
        closingBracketList.add(")");
        closingBracketList.add("]");
        closingBracketList.add("}");

        if (s.length() % 2 != 0 || closingBracketList.contains(String.valueOf(s.charAt(0)))) {
            return isValid;
        }

        ArrayList<String> openBracketList = new ArrayList<>();
        openBracketList.add("(");
        openBracketList.add("[");
        openBracketList.add("{");

        HashMap<String, String> hashMapParenthesis = new HashMap<>();
        hashMapParenthesis.put(")", "(");
        hashMapParenthesis.put("]", "[");
        hashMapParenthesis.put("}", "{");

        ArrayList<String> stackList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (openBracketList.contains(currentChar)) {
                stackList.add(currentChar);
            }

            if(stackList.isEmpty() && closingBracketList.contains(currentChar)){
                return isValid;
            }

            if (closingBracketList.contains(currentChar) && !stackList.isEmpty()) {
                int size = stackList.size();
                String stackChar = stackList.get(size - 1);
                if (hashMapParenthesis.get(currentChar).equalsIgnoreCase(stackChar)) {
                    stackList.remove(stackChar);
                } else {
                    return isValid;
                }
            }

        }

        if (stackList.isEmpty()) {
            isValid = true;
        }
        return isValid;
    }

}
