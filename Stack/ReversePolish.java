import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) {
        String[] tokens = new String[]{"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }

    static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        int ans, a, b;
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                switch (tokens[i]) {
                    case "+":
                        a = stack.pop();        
                        b = stack.pop();        
                        ans = a + b;
                        stack.push(ans);
                        break;
                        
                    case "-":
                        a = stack.pop();        
                        b = stack.pop();        
                        ans = b - a;
                        stack.push(ans);
                        break;   

                    case "*":
                        a = stack.pop();
                        b = stack.pop();
                        ans = a * b;
                        stack.push(ans);
                        break;

                    case "/":
                        a = stack.pop();
                        b = stack.pop();
                        ans = b / a;
                        stack.push(ans);
                        break;
                    default:
                        break;
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            
        }

        return stack.pop();
        
    }
}
