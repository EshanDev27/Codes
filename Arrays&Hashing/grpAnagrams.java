
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class grpAnagrams {
    public static void main(String[] strs) {
        String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnangrams(arr);
        for (List<String> list2 : list) {
            System.out.println(list2);
        }
    }

    static List<List<String>> groupAnangrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        String[] sorted = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            sorted[i] = new String(arr);
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], new ArrayList<>());
            }
            map.get(sorted[i]).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}