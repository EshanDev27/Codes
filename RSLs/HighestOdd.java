import java.util.Arrays;
import java.util.HashMap;

public class HighestOdd {
    public static void main(String[] args) {
        String s = "01101";
        System.out.println(maximumOddBinaryNumber(s));
    }

    static String maximumOddBinaryNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        char[] ans = new char[s.length()];
        while (i < s.length()) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            i++;
        }
        ans[ans.length - 1] = '1';
        map.put('1', map.get('1') - 1);
        i = ans.length - 2;
        while (i >= 0) {
            if (map.get('1') > 0 && map.get('1') == i + 1) {
                ans[i] = '1';
                map.put('1', map.get('1') - 1);
            }else{
                ans[i] = '0';
            }
            i--;
        }

        return String.valueOf(ans);
    }
}
