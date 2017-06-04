/**
 * Created by hyh on 2017/2/28.
 */
public class MinimumAbsoluteDifferenceInBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static int getMinimumDifference(TreeNode root) {
        if(root == null) return  0;
        int min = 0,minTemp =0;
        int leftMin = getMinimumDifference(root.left);
        int rightMin = getMinimumDifference(root.right);
        if(root.left != null )
           // min = Math.abs()
        min = Math.abs(root.val - root.left.val) >= Math.abs(root.val - root.right.val) ? Math.abs(root.val - root.right.val) : Math.abs(root.val - root.left.val);
        min = min <= leftMin ? min : leftMin;
        min = min <= rightMin ? min : rightMin;

        return min;
    }

    public  static void main(String[] args){
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(9);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        int result = getMinimumDifference(node1);
        //System.out.println(result.left.val);
         System.out.println(result);

    }

}
