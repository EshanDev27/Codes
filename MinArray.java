import java.util.Arrays;

public class MinArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }

    static int minSubArrayLen(int target, int[] nums) {
        // Arrays.sort(nums);
        int left = 0, right = 0, maxLength = Integer.MIN_VALUE, sum = 0;
        while(right < nums.length - 1){
            if(sum >= target){
                right--;
                maxLength = Math.max(maxLength, right - left + 1);
                sum -= nums[left];
                left++;
            }else{
                sum += nums[right];
                right++;
            }
        }

        return maxLength;
    }
}
