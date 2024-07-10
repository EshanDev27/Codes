import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,4,4}, 9);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; 
    }
}

// Better Solution
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int size = nums.length;
//         for(int i = 1; i < size; i++){
//             for(int j = i; j < size; j++){
//                 if(nums[j] + nums[j - i] == target){
//                     return new int[]{j, j - i};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }