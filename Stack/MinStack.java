import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        MinStack small = new MinStack();
        small.push(2147483646);
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.push(2147483646);
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.push(2147483647);
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.pop();
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.pop();
        // small.push(10);
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.pop();
        // small.push(-7);
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.push(2147483647);
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.push(-2147483648);
        // small.pop();
        System.out.println("Top of the stack is " + small.top() + " Minimun value of the Stack is " + small.getMin());
        small.pop();
    }

    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        if(stack.empty()){
            stack.push(val);
            minStack.push(val);
        }else{
            stack.push(val);
            val = Math.min(val, minStack.peek());
            minStack.push(val);
        }
    }   

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
