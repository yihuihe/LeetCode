import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by hyh on 2017/3/14.
 */

public class BinaryTreePostorderTraversal {
    public class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)  return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(stack.size()!=0){
            TreeNode temp = stack.peek();
            if(temp.left == null && temp.right == null)
            {
                TreeNode temp1 = stack.pop();
                list.add(temp1.val);
            }
            else{
                if(temp.right != null){
                    stack.push(temp.right);
                    temp.right = null;
                }
                if(temp.left != null){
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }
        return list;

    }

}
