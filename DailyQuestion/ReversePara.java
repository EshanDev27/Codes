import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class ReversePara {
    public static void main(String[] args) {
        String str = "(u(love)i)";
        System.out.println(reverseParentheses(str));
    }

    static String reverseParentheses(String s){
        Stack<Character> stk = new Stack<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                while (stk.peek() != '(') {   
                    list.add(stk.pop());
                }
                stk.pop(); // remove the '('
                for (int j = 0; j < list.size(); j++) {
                    stk.push(list.get(j));
                }
                list.clear();
            } else {
                stk.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stk.empty()) {
            ans.append(stk.pop());
        }

        return ans.reverse().toString();
    }
}
