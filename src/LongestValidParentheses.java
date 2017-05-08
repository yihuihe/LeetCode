import java.util.Stack;

/**
 * Created by hyh on 2017/5/8.
 */
public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        if (s == null || s.length() <= 0)
            return 0;
        int start = -1;
        int len = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                if (stack.size() != 0) {
                    stack.pop();
                    if (stack.isEmpty())
                        len = Math.max(i - start , len);
                    else
                        len = Math.max(i - stack.peek(), len);
                } else
                    start = i;
            }
        }
        return len;
    }
    public static void main(String[] args){
        int result =longestValidParentheses(")()())()()(");
        System.out.print(result);
    }
}
