package hashmap;

import static java.lang.System.out;

import java.util.HashMap;

public class FindFirstRecurringCharJan2023 {
    int[] num_array=new int[10];
    HashMap<Integer,Integer> hashMap;
    public FindFirstRecurringCharJan2023(int[] _num_arr){
        num_array = _num_arr;
        hashMap=new HashMap<>();
    }

    public void findFirstRepeatedCharacterViaLoop(){
        int min_diff=0;
        int first_repeated=0;
        for(int i=0;i<num_array.length;i++){
            for(int j=i+1;j<num_array.length;j++){
                if(num_array[i]==num_array[j]){
                    int temp_diff = j-i;
                    if(min_diff==0){
                        min_diff = temp_diff;
                        first_repeated = num_array[i];
                    }else if(temp_diff < min_diff) {
                        min_diff = temp_diff;
                        first_repeated = num_array[i];
                    }
                }
            }
        }
        out.println("First Repeated: "+first_repeated);
    }

    public void findFirstRepeatedCharacterViaHashMap(){
        for(int i=0;i<num_array.length;i++){
            out.println("Num: "+num_array[i]);
            if(hashMap.containsKey(num_array[i])){
               out.println("First repeated number is: "+num_array[i]);
               break;
            }else {
                hashMap.put(num_array[i],num_array[i]);
            }
        }
    }
}
