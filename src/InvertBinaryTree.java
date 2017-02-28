/**
 * Created by hyh on 2017/2/28.
 */
public class InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode invertTree(TreeNode root){
        if(root == null) return null;

        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);

        return root;

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
        TreeNode result = invertTree(node1);
        //System.out.println(result.left.val);

        System.out.println(node1.left.val);
        System.out.println(node1.right.val);
        System.out.println(node2.left.val);
        System.out.println(node2.right.val);
        System.out.println(node3.left.val);
        System.out.println(node3.right.val);

    }
}
