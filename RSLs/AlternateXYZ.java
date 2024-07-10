import java.util.Arrays;

public class AlternateXYZ {
    public static void main(String[] args) {
        String str = "i.abc.efg.hij";
        System.out.println(sepByDots(str));
    }

    static String sepByDots(String str) {
        char[] ans = new char[str.length()];
        int cnt = 0, i = 0;
        while (i < str.length() - 1) {
            if (str.charAt(i) == '.') {
                cnt++;
                ans[i] = '.';
            }

            if (cnt % 2 != 0) {
                ans[++i] = 'x';
                ans[++i] = 'y';
                ans[++i] = 'z';
            } else {
                ans[i] = str.charAt(i);
            }

            i++;
        }

        return new String(ans);
    }
}