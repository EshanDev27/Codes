import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("am");
        list.add("Eshan");
        list.add("Dev");
        String ans = encode(list);
        // System.out.println(ans);

        list = decode(ans);
        for (String string : list) {
            System.out.println(string);
        }
    }

    static String encode(List<String> strs) {
        String ans = "";
        for(int i = 0; i<strs.size(); i++){
            ans = ans.concat(strs.get(i));
            ans = ans.concat(";");
        }
        return ans;
    }

    static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder tempStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ';'){
                list.add(tempStr.toString());
                tempStr.replace(0, tempStr.length(), "");
                continue;
            }
            tempStr.append(str.charAt(i));
        }
        return list;
    }
}