/**
 * Created by hyh on 2017/4/30.
 */
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}
public class BinaryTreeTilt {
    private static int sumResult = 0;
    public static int findTilt(TreeNode root) {
        if(root == null)
            return 0;
        Find(root);
        return sumResult;
    }

    public static int Find(TreeNode root){
        if(root == null)
            return 0;
        int leftSum = 0;
        int rightSum = 0;
        leftSum = Find(root.left);
        rightSum = Find(root.right);
        sumResult += Math.abs(leftSum-rightSum);
        return  root.val+ leftSum + rightSum;
    }
    public  static  void main (String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
       // TreeNode node3 = new TreeNode(3);
      //  TreeNode node4 = new TreeNode(5);
        node1.left = node2;
        node1.right =null;
        node2.left = null;
        node2.right = null;
       // node3.left = node4;
        //node3.right = null;
       // node4.left = null;
      //  node4.right = null;

        System.out.println(findTilt(node1));
    }
}
