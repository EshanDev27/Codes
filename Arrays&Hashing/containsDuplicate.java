import java.util.*;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(containsDuplicate1(nums));
    }

    static boolean containsDuplicate1(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], 0);
        }
        return false;
    }
}