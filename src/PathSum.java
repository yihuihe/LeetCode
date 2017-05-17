/**
 * Created by hyh on 2017/5/17.
 */
public class PathSum {
    private static boolean result = false;
    public static void PathSum(TreeNode root,int sumTemp,int target){
        if(root == null)
            return ;
        if(root.left == null && root.right == null)
        {
            if(sumTemp + root.val == target)
            {
                result = true;
                return;
            }

        }
        PathSum(root.left,sumTemp+root.val,target);
        PathSum(root.right,sumTemp+root.val,target);
    }
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root ==null)
            return false;
        PathSum(root,0,sum);
        boolean tempResult = result;
        result = false;
        return tempResult;

    }
    public  static void main(String[] args){
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        node1.left = node2;
        node1.right =node3;
        node2.left = node4;
        node2.right = null;
        // node3.left = node4;
        //node3.right = null;
        // node4.left = null;
        //  node4.right = null;
        System.out.print(hasPathSum(node1,20));
    }

}
