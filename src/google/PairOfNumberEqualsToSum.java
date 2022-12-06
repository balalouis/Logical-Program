package google;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;

public class PairOfNumberEqualsToSum {
    public void findPairOfSumEqualsToNumber(int[] num, int sum) {
        for (int i = 0; i < num.length;i++) {
            for(int j=i+1; j< num.length;j++){
                int value=num[i] + num[j];
                if(value==sum){
                    out.println("Array position of "+i +" and "+j +" is equals to sum");
                    break;
                }
            }
            out.println();
        }
    }

    public void findPairOfSumEqualsToNumberInEfficiantWay(int[] num, int sum) {
        ArrayList arrayList=new ArrayList();
        for(int i=0;i<num.length;i++){
            int value = sum-num[i];
            if(arrayList.contains(value)){
                out.println("Found");
                break;
            }else {
                arrayList.add(value);
            }
        }
        out.println(Arrays.toString(arrayList.toArray()));
    }
}
