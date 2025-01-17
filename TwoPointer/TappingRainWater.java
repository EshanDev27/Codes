import java.util.Arrays;

public class TappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }

    static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int ans = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;
    }
}
