package sort;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        insertionSort(arr);
        System.out.print("Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];

            arr[j + 1] = key;
        }
    }
}
