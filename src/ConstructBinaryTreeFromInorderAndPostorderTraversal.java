/**
 * Created by hyh on 2017/3/15.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildNode(int[] inorder,int inStart, int inEnd, int[] postorder, int poStart, int poEnd){
        if(inStart > inEnd || poStart > poEnd)
            return null;
        int rootVal = postorder[poEnd];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = -1;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i] == rootVal)
            {
                rootIndex= i;
                break;
            }
        }
        root.left = buildNode(inorder,inStart, (rootIndex - 1), postorder, poStart, poStart + rootIndex - inStart -1 );
        root.right = buildNode(inorder,rootIndex+1,inEnd,postorder,poStart + rootIndex - inStart,poEnd-1);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0)
            return null;
        int inStart = 0;
        int inEnd = inorder.length -1;
        int poStart = 0;
        int poEnd = postorder.length -1;

        return buildNode(inorder,inStart,inEnd,postorder,poStart,poEnd);

    }
}
