/**
 * Created by hyh on 2017/6/4.
 */
public class BinaryTreeMaximumPathSum {
    private static int max = Integer.MIN_VALUE;
    public static int maxSum(TreeNode root){
        if(root == null)
            return 0;
        int left = maxSum(root.left);
        int right = maxSum(root.right);
        int sum = root.val;
        if(left > 0)
            sum += left;
        if(right > 0)
            sum += right;
        if( max < sum)
            max = sum;
        return Math.max(left,right) > 0 ? Math.max(left,right)+root.val : root.val;
    }
    public static int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        int result = maxSum(root);
        max = Integer.MIN_VALUE;
        return result;

    }
    public  static  void  main(String[] args) {
        TreeNode node1 = new TreeNode(-2);
        TreeNode node2 = new TreeNode(1);
        //TreeNode node3 = new TreeNode(3);
        //TreeNode node4 = new TreeNode(15);
        //TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = null;
        // node2.left = null;
        // node2.right = null;
        //  node3.left = node4;
        //  node3.right = node5;
        // node4.left = null;
        //  node4.right = null;
        System.out.print(maxPathSum(node1));
    }
}
