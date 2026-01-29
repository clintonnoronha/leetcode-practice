import java.util.Arrays;

public class NeighbourSum {

    public static void main(String[] args) {
        int[] in = new int[] {4, 0, -1, -2, 3};
        int[] out = new int[in.length];
        for (int i = 1; i <= in.length; i++) {
            int left = (i == 1) ? 0 : in[i - 2];
            int right = (i == in.length) ? 0 : in[i];
            out[i - 1] = left + in[i - 1] + right;
        }
        System.out.println(Arrays.toString(out));
    }
}
