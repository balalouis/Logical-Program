package sort;

import java.util.Arrays;

public class BubbleSort {
    int[] num = {6,5,3,7,8,1,2,4};

    public void bubbleSort(){
        System.out.println(Arrays.toString(num));
        for(int i=0;i<num.length;i++){
            for(int j=0; j<num.length-1;j++){
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(num));
        }
        System.out.println("Sort completed: "+Arrays.toString(num));
    }

}
