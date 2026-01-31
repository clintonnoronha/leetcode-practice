package sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.print("Sorted array: " + Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] nums) {
        int len = nums.length;

        if (len > 1) {
            int[] temp = new int[len];
            mergeSort(nums, 0, len - 1, temp);
        }

        return nums;
    }

    public static void mergeSort(int[] arr, int low, int high, int[] temp) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid, temp);
        mergeSort(arr, mid + 1, high, temp);
        merge(arr, low, mid, high, temp);
    }

    public static void merge(int[] arr, int low, int mid, int high, int[] temp) {
        if (high + 1 - low >= 0)
            System.arraycopy(arr, low, temp, low, high + 1 - low);

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j])
                arr[k++] = temp[i++];
            else
                arr[k++] = temp[j++];
        }

        // right side elements are already in place
        while (i <= mid)
            arr[k++] = temp[i++];
    }
}
