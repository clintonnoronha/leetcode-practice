import java.util.*;

public class MaximumSumDistinctSubarrayLengthK  {

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        long result = maximumSubarraySum(nums, k);
        System.out.println("Maximum sum of a subarray of length " + k + " with all distinct elements: " + result);
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> freq = new HashSet<>();
        long sum = 0;
        long maxSum = 0;

        for (int start = 0, end = 0; end < nums.length; end++) {
            if (!freq.contains(nums[end])) {
                freq.add(nums[end]);
                sum += nums[end];

                if (end - start + 1 == k) {
                    maxSum = Math.max(maxSum, sum);
                    freq.remove(nums[start]);
                    sum -= nums[start++];
                }
            } else {
                while (nums[start] != nums[end]) {
                    sum -= nums[start];
                    freq.remove(nums[start++]);
                }
                start++;
            }
        }
        return maxSum;
    }
}