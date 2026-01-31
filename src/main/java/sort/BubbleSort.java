package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        boolean isSwapped = true;
        for (int i = 0; i < len - 1 && isSwapped; i++) {
            isSwapped = false;
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
        }
    }
}
