import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(arr);
        System.out.println("After Next Permutation: " + Arrays.toString(arr));
    }

    public void nextPermutation(int[] arr) {
        int right = arr.length - 2;
        int idx1 = -1;
        int idx2 = -1;

        while (right >= 0) {
            if (arr[right] < arr[right + 1]) {
                idx1 = right;
                break;
            }
            right--;
        }

        if (idx1 == -1) {
            reverse(arr, 0);
            return;
        }

        right = arr.length - 1;
        while (right > idx1) {
            if (arr[right] > arr[idx1]) {
                idx2 = right;
                break;
            }
            right--;
        }

        swap(arr, idx1, idx2);
        reverse(arr, idx1 + 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end)
            swap(arr, start++, end--);
    }
}
