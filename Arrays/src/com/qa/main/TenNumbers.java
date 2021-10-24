/*
Exercise - Create an array of numbers 1 - 10
- Print out the number * 2 ( 2 -> 4, 3 ->6)
- Print out the squared value of each of the numbers (2 -> 4, 3 -> 9)
- Have a second array created with 10 numbers 1,1,1,1,1.. when you square the number from the first array,
  modify the 2nd array to have the squared number

Stretch goal
- Do the same for the last exercise but in reverse, 10th number in 2nd array will be 1st number squared
 */

package com.qa.main;

public class TenNumbers {

    public static int[] CreateArrayOfNumbers() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    };

    public static int[] CreateArrayOfSquaredValues(int[] inputNumbersArray) {
        int[] localNumbersArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i=0; i < localNumbersArray.length; i++) {
            localNumbersArray[i] = inputNumbersArray[i] * inputNumbersArray[i];
        }
        return localNumbersArray;
    };

    public static int[] CreateReversedArrayOfSquaredValues(int[] inputNumbersArray) {
        int[] localNumbersArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i=0; i < localNumbersArray.length; i++) {
            int index = localNumbersArray.length - (i + 1);
            localNumbersArray[i] = inputNumbersArray[index] * inputNumbersArray[index];
        }
        return localNumbersArray;
    }

}
