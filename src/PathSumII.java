import java.util.ArrayList;

/**
 * Created by hyh on 2017/6/1.
 */
public class PathSumII {
    public static void findPath(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, TreeNode root, int sum, int target){
        if(root == null )
            return ;
        if(root.left == null && root.right == null){
            if(sum + root.val == target){
                ArrayList<Integer> result = new ArrayList<>(temp);
                result.add(root.val);
                list.add(result);
                return ;
            }
        }
        ArrayList<Integer> newTemp = new ArrayList<>(temp);
        newTemp.add(root.val);
        sum+=root.val;
        findPath(list,newTemp,root.left,sum,target);
        findPath(list,newTemp,root.right,sum,target);
    }
    public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        if(root.left == null && root.right == null){
            if(root.val == sum){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(root.val);
                list.add(result);
            }
            return list;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        //temp.add(root.val);
        findPath(list,temp,root,0,sum);
        return list;

    }
    public static void  main(String[] args){
        TreeNode node1=  new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node4.left = node7;
        node4.right = node8;
        node6.left = node9;
        node6.right =node10;
        ArrayList<ArrayList<Integer>> list= pathSum(node1,22);
        System.out.print("hello");

    }
}
