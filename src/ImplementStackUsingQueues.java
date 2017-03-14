import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hyh on 2017/3/14.
 */
public class ImplementStackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
        for(int i=0;i<queue1.size()-1;i++)
            queue1.add(queue1.remove());
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue1.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.size()==0 )
            return true;
        else
            return false;
    }

    public  static  void  main (String[] args){
        ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
        obj.push(3);
        int param_3 = obj.top();
        System.out.println(param_3);
        int param_2 = obj.pop();
        System.out.println(param_2);
        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }
}
