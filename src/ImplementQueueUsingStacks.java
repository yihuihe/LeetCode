import java.util.Stack;

/**
 * Created by hyh on 2017/3/14.
 */
public class ImplementQueueUsingStacks {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.size()<=0){
            while(stack1.size()>0){
                int temp = stack1.pop();
                stack2.push(temp);
            }
        }
        int result = stack2.pop();
        return result;
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.size()<=0){
            while(stack1.size()>0){
                int temp = stack1.pop();
                stack2.push(temp);
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.size() == 0 && stack2.size() == 0)
            return true;
        else
            return false;
    }

    public  static  void  main (String[] args){
        ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
        obj.push(3);
        int param_3 = obj.peek();
        System.out.println(param_3);
        int param_2 = obj.pop();
        System.out.println(param_2);
        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }
}
