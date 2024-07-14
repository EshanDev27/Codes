import java.util.Stack;

public class LogFolder {
    public static void main(String[] args) {
        String[] str = new String[]{"./","../","./"};
        System.out.println(minOperations(str));
    }

    static int minOperations(String[] logs){
        Stack<String> stk = new Stack<>();
        for (int j = 0; j < logs.length; j++) {     
            if(!stk.isEmpty() && logs[j].substring(0, logs[j].length() - 1).equals("..")){
                stk.pop();
            }else if(logs[j].substring(0, logs[j].length() - 1).equals(".")) {
                continue;
            }else if(!logs[j].substring(0, logs[j].length() - 1).equals(".") && !logs[j].substring(0, logs[j].length() - 1).equals("..")){
                stk.push(logs[j].substring(0, logs[j].length() - 1));
            }
        }

        return stk.size();
    }
}
