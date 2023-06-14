package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {



    public int[] mergeSort(int[] currentArray){
        if (currentArray.length == 1) {
            return currentArray;
        }
        int[] left = Arrays.copyOfRange(currentArray,0,(currentArray.length/2));
        int[] right = Arrays.copyOfRange(currentArray, (currentArray.length / 2), currentArray.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    private int[] merge(int[] left, int[] right){
        System.out.println("Left: "+Arrays.toString(left));
        System.out.println("Right: "+Arrays.toString(right));
        ArrayList arrayList = new ArrayList(left.length + right.length);
        if(left.length==1 && right.length==1){
            int[] finalArray = new int[left.length + right.length];
            if(left[0]>right[0]){
                arrayList.add(right[0]);
                arrayList.add(left[0]);
            }else {
                arrayList.add(left[0]);
                arrayList.add(right[0]);
            }
            System.out.println("Al List: "+arrayList);
            for(int i=0; i<arrayList.size(); i++) {
                finalArray[i] = (int) arrayList.get(i);
            }
            return finalArray;
        }else {
            System.out.println("Merge size > 1");
            System.out.println("Left: "+Arrays.toString(left));
            System.out.println("Right: "+Arrays.toString(right));
            return sort(left, right);
        }
    }

    private int[] sort(int[] left, int[] right){
        int[] sortedValue = new int[left.length + right.length];
        int currentLeftPos = 0;
        int currentRightPos = 0;
        int currentSortPos = 0;
        while (currentLeftPos != left.length && currentRightPos != right.length) {
            if (left[currentLeftPos] > right[currentRightPos]) {
                sortedValue[currentSortPos] = right[currentRightPos];
                currentSortPos++;
                currentRightPos++;
            } else {
                sortedValue[currentSortPos] = left[currentLeftPos];
                currentSortPos++;
                currentLeftPos++;
            }
        }
        if(currentLeftPos < left.length){
            for (int i = currentLeftPos; i < left.length; i++) {
                sortedValue[currentSortPos] = left[i];
                currentSortPos++;
            }
        }

        if(currentRightPos < right.length){
            for (int i = currentRightPos; i < right.length; i++) {
                sortedValue[currentSortPos] = right[i];
                currentSortPos++;
            }
        }
        System.out.println("Sorted Val: " + Arrays.toString(sortedValue));
        return sortedValue;
    }

}

