package company;

import java.util.*;

public class TCS {

    /*
        Find min cost of the projects
        Ex: Projects -> 2, 0, 1, 2, 1
            Bidding  -> 7, 4, 6, 8, 2

            Min bidding : 0 -> 4, 1 -> 2, 2 -> 7 : Total - 13[4+2+7]
     */
    public long findMinCost() {

        ArrayList<String> projectIdList = new ArrayList<>();
        projectIdList.add("2");
        projectIdList.add("0");
        projectIdList.add("1");
        projectIdList.add("2");
        projectIdList.add("1");

        ArrayList<Integer> bidList = new ArrayList<>();
        bidList.add(7);
        bidList.add(4);
        bidList.add(6);
        bidList.add(8);
        bidList.add(2);

        if (!projectIdList.contains("0")) {
            return -1;
        } else {
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < projectIdList.size(); i++) {
                String key = projectIdList.get(i);
                if (!hashMap.containsKey(key)) {
                    hashMap.put(key, bidList.get(i));
                } else {
                    int bid_value = bidList.get(i);
                    int map_value = hashMap.get(key);
                    if (bid_value < map_value) {
                        hashMap.put(key, bid_value);
                    }
                }
            }

            int bidCostTotal = 0;

            for (Map.Entry<String, Integer> mapElement : hashMap.entrySet()) {
                bidCostTotal = bidCostTotal + mapElement.getValue();
            }
            return Integer.toUnsignedLong(bidCostTotal);
        }
    }

}
