import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                cnt = map.get(nums[i]);
                cnt++;
                map.put(nums[i], cnt);
                cnt = 1;
            }
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (a,b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < k; i++) {
            ans[i] = entries.get(i).getKey();
        }
        return ans;
    }
}