package wt.com.alg.stack;

import java.util.Map;
import java.util.Stack;

//给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
//括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
public class characterS {
    public static void main(String[] args) {
        String s = "[]";

    }

    public boolean isValid(String s) {
        // write code here
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            }else{

                return (stack.empty() || c !=stack.pop());
            }
        }
        return stack.empty();
    }
}
