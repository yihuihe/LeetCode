import java.util.Stack;

/**
 * Created by hyh on 2017/3/14.
 */
public class EvaluateReservePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack();
        String operator = "+-*/";
        for(String temp : tokens){
            if(!operator.contains(temp))
                stack.push(temp);
            else{
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                switch(temp){
                    case "+": stack.push(String.valueOf(a+b));break;
                    case "-": stack.push(String.valueOf(a-b));break;
                    case "*": stack.push(String.valueOf(a*b));break;
                    case "/": stack.push(String.valueOf(a/b));break;
                    default: ;
                }
            }
        }
        int result =  Integer.valueOf(stack.pop());
        return result;
    }
    public static  void main (String[] args){
    String[]  s = new String[]{"3","3","-","4","+","2","*"};
    System.out.print(evalRPN(s));
    }
}
