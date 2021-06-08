package wt.com.alg.stack;

import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        int t=stack.peek();
        System.out.println(t);
        System.out.println(stack.pop());
    }
}
