import java.util.Stack;

public class ReversePara {
    public static void main(String[] args) {
        
    }

    static String reverseParentheses(String s){
        Stack<Character> stk = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                while (s.charAt(i) != '(') {   
                    ans += ans + Character.toString(stk.pop());
                }
            }else{
                stk.push(s.charAt(i));
            }
        }
    }
}
