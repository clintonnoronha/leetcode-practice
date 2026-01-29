import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
        for (Integer num: count.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.poll();
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--)
            res[i] = minHeap.poll();

        System.out.println(Arrays.toString(res));
    }
}
