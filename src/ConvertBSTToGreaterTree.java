/**
 * Created by hyh on 2017/5/18.
 */
public class ConvertBSTToGreaterTree {
    public static int convert(TreeNode root, int sum) {
        if(root ==null)
            return 0 ;
        int right = convert(root.right,sum);
        root.val = root.val+right+sum;
        int newSum = root.val;
        if(root.left!=null){
            int left = convert(root.left,newSum);
            return newSum + left;
        }
        else
            return newSum;

    }

    public static TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root;
        convert(root, 0);
        return temp;

    }
    public static  void main(String[] args){
        TreeNode node1 =new TreeNode(2);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(-4);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(13);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        convertBST(node1);
    }
}