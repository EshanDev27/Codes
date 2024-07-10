import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    static int[] twoSum(int[] numbers, int target){
        int left = 0, right = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if((numbers[left] + numbers[right]) > target){
                right--;
            }else if((numbers[left] + numbers[right]) < target){
                left++;
            }else{
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1};
    }
}
