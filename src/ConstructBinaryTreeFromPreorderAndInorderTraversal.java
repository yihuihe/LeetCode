/**
 * Created by hyh on 2017/3/20.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
      class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public  TreeNode buildNode(int[] preorder,int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart > preEnd || inStart > inEnd)
            return null;
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = -1;

        for(int i=0;i<inorder.length;i++){
            if(rootVal == inorder[i]){
                rootIndex = i;
                break;
            }
        }


        root.left=buildNode(preorder,preStart+1,preStart+rootIndex-inStart,inorder,inStart,rootIndex-1);

        root.right = buildNode(preorder,preStart+rootIndex-inStart+1,preEnd,inorder,rootIndex+1,inEnd);

        return root;


    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //if(preorder.length==0 || preorder == null || inorder.length == 0　|| inorder == null)
        //  return null;
        int preStart = 0;
        int preEnd = preorder.length -1;
        int inStart = 0;
        int inEnd = inorder.length -1 ;

        return  buildNode(preorder,preStart,preEnd,inorder,inStart,inEnd);

    }

}
