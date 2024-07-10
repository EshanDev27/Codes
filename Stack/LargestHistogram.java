import java.util.Arrays;
import java.util.Stack;

public class LargestHistogram {
    public static void main(String[] args) {
        int[] heights = new int[]{2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }

    static int largestRectangleArea(int[] heights){
        int[] prevSmaller = new int[heights.length];
        int[] nextSmaller = new int[heights.length];
        prevSmaller = prevSmallerInt(heights);
        nextSmaller = nextSmallerInt(heights);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int current = (nextSmaller[i] - prevSmaller[i] - 1) * heights[i];
            max = Math.max(max, current);
        }
        return max;

    }

    static int[] prevSmallerInt(int[] arr){
        Stack<Integer> smallerIndex = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while(!smallerIndex.empty() && arr[smallerIndex.peek()] >= arr[i])
            {
                smallerIndex.pop();
            }
            if(smallerIndex.empty()){
                ans[i] = -1;
            }else{
                ans[i] = smallerIndex.peek();
            }
            smallerIndex.push(i);
        }

        return ans;
    }

    static int[] nextSmallerInt(int[] arr){
        Stack<Integer> smallIntegers = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!smallIntegers.empty() && arr[smallIntegers.peek()] >= arr[i]) {
                smallIntegers.pop();
            }
            if(smallIntegers.empty()){
                ans[i] = arr.length;
            }else{
                ans[i] = smallIntegers.peek();
            }
            smallIntegers.push(i);
        }

        return ans;
    }
}
