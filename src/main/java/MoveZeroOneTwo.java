import java.util.Arrays;

public class MoveZeroOneTwo {

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 0, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1) {
                while (left < right && arr[right] == 1)
                    right--;
                swap(arr, left, right--);
            } else if (arr[left] == 0) {
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 0, 1, 2, 0, 1, 0, 0, 1, 2, 0, 1};
        System.out.println(Arrays.toString(arr));

        int mid = 0;
        left = 0;
        right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] == 0)
                swap(arr, mid++, left++);
            else if (arr[mid] == 1)
                mid++;
            else if (arr[mid] == 2)
                swap(arr, mid, right--);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
