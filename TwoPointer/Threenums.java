import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threenums {
    public static void main(String[] args) {
        int[] nums = new int[]{-3, 2, 0, 2, 1, 0, 1};
        System.out.println(threenums(nums));
    }

    static List<List<Integer>> threenums(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans_list = new ArrayList<>();
        int a, left, right;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            a = nums[i];
            left = i + 1;
            right = nums.length - 1;

            while (left < right) {
                int sum = a + nums[left] + nums[right];
                if (sum == 0) {
                    ans_list.add(Arrays.asList(a, nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans_list;
    }
}