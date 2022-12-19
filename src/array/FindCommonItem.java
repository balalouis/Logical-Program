package array;

import static java.lang.System.out;

import java.util.ArrayList;

public class FindCommonItem {

    public boolean findCommonItemBruitForce(String[] arrOne, String[] arrTwo){
        // Array One -> ['a','b','c','x']
        // Array Two -> ['z','y','x']
        for (String value : arrOne) {
            out.println("----> " + value);
            for (String s : arrTwo) {
                if (value.equalsIgnoreCase(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findCommonItemEfficiant(String[] arrOne, String[] arrTwo){
        // Array One -> ['a','b','c','x']
        // Array Two -> ['z','y','x']
        ArrayList<String> arrayList=new ArrayList();
        for (String value : arrOne) {
            arrayList.add(value);
        }

        for(String value: arrTwo){
            if(arrayList.contains(value)){
                return true;
            }
        }
        return false;
    }

}
