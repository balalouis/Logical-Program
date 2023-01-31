package array;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArrayDec {

    public void mergeSortedArray(int[] arrayOne, int[] arrayTwo){
        int firstArrayCurrentPosition =0;
        int secondArrayCurrentPosition =0;
        ArrayList mergedList=new ArrayList();
        int firstArrayCurrentValue;
        int secondArrayCurrentValue;

        int totalMergedArraySize = arrayOne.length + arrayTwo.length;
        while(mergedList.size()<=totalMergedArraySize){

            if(!isArrayReachedEnd(arrayOne,firstArrayCurrentPosition)){
                firstArrayCurrentValue=arrayOne[firstArrayCurrentPosition];
            }else {
                break;
            }
            if(!isArrayReachedEnd(arrayTwo,secondArrayCurrentPosition)) {
                secondArrayCurrentValue = arrayTwo[secondArrayCurrentPosition];
            }else {
                break;
            }

            if(firstArrayCurrentValue<=secondArrayCurrentValue){
                mergedList.add(firstArrayCurrentValue);
                firstArrayCurrentPosition++;
            }else {
                mergedList.add(secondArrayCurrentValue);
                secondArrayCurrentPosition++;
            }
        }

        out.println("------> "+ mergedList);

        if(!isArrayReachedEnd(arrayOne,firstArrayCurrentPosition)){
            fillRemainingItem(arrayOne,firstArrayCurrentPosition,mergedList);
        }else if(!isArrayReachedEnd(arrayTwo,secondArrayCurrentPosition)) {
            fillRemainingItem(arrayTwo,secondArrayCurrentPosition,mergedList);
        }

        out.println("------> "+ mergedList);

    }

    private void fillRemainingItem(int[] array, int currentItemPosition, ArrayList mergedList){
        for(int j=currentItemPosition;j<array.length;j++){
            mergedList.add(array[j]);
        }
    }

    private boolean isArrayReachedEnd(int[] array, int currentPosition){
        return array.length == currentPosition;
    }

}
