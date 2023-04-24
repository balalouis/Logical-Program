package sort;

import java.util.Arrays;

public class SelectionSort {

    int[] num = {8,5,2,6,9,3,1,4,0,7};

    public void selectionSort(){
        System.out.println("Before sorting: "+ Arrays.toString(num));

        for(int i=0;i<num.length;i++){
            int smallestNumPosition = i;
            for(int j=i+1; j<num.length;j++){
                if(num[j] < num[smallestNumPosition]){
                    smallestNumPosition = j;
                }
            }
            int temp = num[i];
            num[i] = num[smallestNumPosition];
            num[smallestNumPosition] = temp;
            System.out.println("-----> "+Arrays.toString(num));
        }

        System.out.println("After sorting: "+ Arrays.toString(num));
    }

}
