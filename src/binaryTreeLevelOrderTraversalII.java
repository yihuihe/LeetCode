import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hyh on 2017/6/1.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class binaryTreeLevelOrderTraversalII {
    public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return list;
        queue.add(root);
        int len =1;
        int count=0;
        TreeNode temp = null;
        while(queue.size()!=0){
            ArrayList<Integer> tempResult = new ArrayList<>();
            while(len>0){
                len--;
                temp = queue.remove();
                tempResult.add(temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                    count++;
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                    count++;
                }
            }
            list.add(tempResult);
            if(count>0)
                len = count;
            count=0;

        }
        int end = list.size() -1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while(end>=0){
            result.add(list.get(end));
            end--;
        }
        return result;

    }
    public  static  void  main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = null;
        node2.right = null;
        node3.left = node4;
        node3.right = node5;
        // node4.left = null;
        //  node4.right = null;
        ArrayList<ArrayList<Integer>> list = levelOrderBottom(node1);
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j));
            }
        System.out.println();
        }

    }
}
