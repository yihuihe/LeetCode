/**
 * Created by hyh on 2017/5/8.
 */

public class SubtreeOfAnotherTree {

    public  static boolean isSubtree_judge(TreeNode s,TreeNode t){
        if(s== null && t==null)
            return true;
        if(s == null || t == null)
            return false;
        boolean left =false;
        boolean right = false;
        if(s.val == t.val)
        {
            left = isSubtree_judge(s.left,t.left);
            right = isSubtree_judge(s.right,t.right);
        }
        else
            return false;
        return left && right;
    }
    public static  boolean isSubtree(TreeNode s, TreeNode t) {

        if(s==null )
            return false;
        boolean temp = isSubtree_judge(s,t);
        if(temp)
            return true;
        return (isSubtree(s.left,t) || isSubtree(s.right,t));
    }
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(6);
        TreeNode node9 = new TreeNode(1);
        TreeNode node10 = new TreeNode(2);


        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        node4.left = node6;
        node4.right = node7;

        node8.left = node9;
        node8.right = node10;
        System.out.println(isSubtree(node1,node8));
    }
}
