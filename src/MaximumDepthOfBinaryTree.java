/**
 * Created by hyh on 2017/2/27.
 */
public class MaximumDepthOfBinaryTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return  Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        node1.left = node2;
        node2.left = node3;
        node3.right = node4;
        node4.left = node5;
        node5.left = node6;
        System.out.print(maxDepth(node1));
    }

}
