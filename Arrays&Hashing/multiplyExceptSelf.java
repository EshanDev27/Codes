import java.util.Arrays;

public class multiplyExceptSelf {
    public static void main(String[] args) {
        int[] numss = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(numss)));
    }

    static int[] productExceptSelf(int[] nums){
        int[] ans = new int[nums.length];
        int prefix = 1, postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        System.out.println(Arrays.toString(ans));
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        System.out.println(Arrays.toString(ans));
        
        return ans;
    }
}