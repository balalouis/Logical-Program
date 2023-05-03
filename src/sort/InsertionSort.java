package sort;

import java.util.Arrays;

public class InsertionSort {

    int[] numArray = {10,2,6,15,4,1};

    public void insertSortSection(){
        for(int i=0;i<numArray.length-1;i++){
            System.out.println(numArray[i+1]);
            moveToCorrectPosition(i + 1);
        }
    }

    public void moveToCorrectPosition(int currPosition){
        System.out.println("=========================");
        for (int j = currPosition; j > 0; j--) {
            if(numArray[j] < numArray[j-1]){
                int temp = numArray[j];
                numArray[j] = numArray[j-1];
                numArray[j-1] = temp;
            }
        }
        System.out.println(""+Arrays.toString(numArray));
    }
}
