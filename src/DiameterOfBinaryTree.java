/**
 * Created by hyh on 2017/5/8.
 */
public class DiameterOfBinaryTree {
    public  static int DeepthOfTree(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right))+1;
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root ==null)
            return 0;
        int leftDeepth = DeepthOfTree(root.left);
        int rightDeepth = DeepthOfTree(root.right);
        return leftDeepth + rightDeepth ;
    }
    public  static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(7);
       // TreeNode node6 = new TreeNode(1);
       // TreeNode node7 = new TreeNode(2);
       // TreeNode node8 = new TreeNode(6);
       // TreeNode node9 = new TreeNode(1);
       // TreeNode node10 = new TreeNode(2);


        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        //node4.left = node6;
       // node4.right = node7;

        //node8.left = node9;
        //node8.right = node10;
        System.out.println(diameterOfBinaryTree(node1));
    }
}
