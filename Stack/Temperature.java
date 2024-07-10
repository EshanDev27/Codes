import java.util.Arrays;
import java.util.Stack;

public class Temperature {
    public static void main(String[] args) {
        int[] arr = new int[] {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indexStack = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!indexStack.isEmpty() && temperatures[i] > temperatures[indexStack.peek()]) {
                int idx = indexStack.pop();
                ans[idx] = i - idx;
            }
            indexStack.push(i);
        }
        return ans;
    }
}