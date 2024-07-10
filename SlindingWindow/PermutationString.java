import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PermutationString {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length(), left = 0, right = len1;
        if(len1 > len2){
            return false;
        }
        HashMap<Character, Integer> map_s1 = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < len1; i++) {
            if (map_s1.containsKey(s1.charAt(i))) {
                map_s1.put(s1.charAt(i), map_s1.get(s1.charAt(i)) + 1);
            } else {
                map_s1.put(s1.charAt(i), 1);
            }
        }

        while (left < right) {
            if (map_s1.containsKey(s2.charAt(left))) {
                window.put(s2.charAt(left), window.getOrDefault(window.get(s2.charAt(left)), 0) + 1);
                left++;
            } else {
                left++;
                right++;
                window.clear();
            }
        }
        if (map_s1.equals(window)) {
            return true;
        }

        return false;
    }
}