package sort;

import java.util.Arrays;

public class QuickSort {
//    int[] currentArray = {24, 9, 29, 14, 19, 27};
//    int[] currentArray = {5,3,8,1,4,6,2,7};
    int[] currentArray = {5,3,8,1,4,6};
    int[] framingArray = new int[currentArray.length];
    int frameCurrentPos = 0;
    public int[] quickSort(){
        int[] finalQuickSort=quick(currentArray);
        System.out.println("Final quick sort: " + Arrays.toString(finalQuickSort));
        return currentArray;
    }

    private int[] quick(int[] currentArray) {
        insertFrameArraySizeIsOne(currentArray);
        int left = 0;
        int right = currentArray.length - 1;
        int pivot = 0;

        while (left != right) {
            if (left == pivot) {
                if (currentArray[pivot] < currentArray[right]) {
                    // move towards from right to left
                    right--;
                } else {
                    // swap it
                    int temp = currentArray[right];
                    currentArray[right] = currentArray[left];
                    currentArray[left] = temp;
                    pivot = right;
                }
            } else {
                if (currentArray[left] < currentArray[pivot]) {
                    // move towards from left to right
                    left++;
                } else {
                    // swap it
                    int temp = currentArray[right];
                    currentArray[right] = currentArray[left];
                    currentArray[left] = temp;
                    pivot = left;
                }
            }
        }

        insertIntoFrameArraySizeIsMoreThanThree(currentArray,pivot);
        splitArray(currentArray, pivot);
        if(frameCurrentPos==framingArray.length){
            return framingArray;
        }
        return currentArray;
    }

    private void insertFrameArraySizeIsOne(int[] currentArray){
        if (currentArray.length == 0 || currentArray.length == 1) {
            if (framingArray[frameCurrentPos] != 0) {
                // Find a position which is not occupied
                while (framingArray[frameCurrentPos] != 0) {
                    frameCurrentPos++;
                }
            }
            // insert into it
            framingArray[frameCurrentPos] = currentArray[0];
            frameCurrentPos++;
        }
    }
    private void insertIntoFrameArraySizeIsMoreThanThree(int[] currentArray, int pivot) {
        if (currentArray.length > 3) {
            framingArray[pivot] = currentArray[pivot];
        }
    }

    private void splitArray(int[] currentArray, int pivot){
        int[] leftArray;
        int[] rightArray;
        if (currentArray.length > 1) {
            if (pivot == 0) {
                leftArray = Arrays.copyOfRange(currentArray, 0, pivot + 1);
            } else {
                leftArray = Arrays.copyOfRange(currentArray, 0, pivot);
            }

            if (pivot == currentArray.length - 1) {
                rightArray = Arrays.copyOfRange(currentArray, pivot, currentArray.length);
            } else {
                rightArray = Arrays.copyOfRange(currentArray, pivot + 1, currentArray.length);
            }
            quick(leftArray);
            quick(rightArray);
        }
    }
}
