import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by hyh on 2017/3/14.
 */
public class BinaryTreePreorderTraversal {

    public class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null ) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(stack.size()!=0){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left !=null)
                stack.push(temp.left);
        }
        return list;

    }
}
