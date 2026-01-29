import java.util.Stack;

public class LargestRectangleHistogram {

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        System.out.println("Max Area is " + maxArea + ".");
    }
}
