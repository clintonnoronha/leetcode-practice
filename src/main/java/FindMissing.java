import java.util.ArrayList;
import java.util.List;

public class FindMissing {

    public static void main(String[] args) {
        // with duplicate
        int[] arr = new int[] {1, 3, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            int key = Math.abs(arr[i]);
            if (arr[key - 1] > 0)
                arr[key - 1] = -arr[key - 1];
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                result.add(i + 1);
        }
        System.out.println("Missing with duplicates: " + result);

        // without duplicates i.e. only 1 missing
        arr = new int[] {1, 3, 4, 2, 0};
        int n = arr.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int j : arr) sum += j;
        System.out.println("Missing without duplicates: " + (totalSum - sum));
    }
}
