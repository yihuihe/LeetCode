import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 2017/5/12.
 */
public class Permutations {
    private static List<List<Integer>> list = new ArrayList<>();
    public static void permutations(List temp,String s){
        if(temp.size()==0)
        {
            List<Integer> result = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                result.add(Integer.valueOf(s.charAt(i)-'0'));
            }
            list.add(result);
            return ;
        }
        int len = temp.size();
        int tempNum = 0;
        for(int j=0;j<temp.size();j++){
            List<Integer> tempList = temp;
            tempNum = tempList.remove(j);
            s += String.valueOf(tempNum);
            permutations(temp,s);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length<=0)
            return null;

        int Arraylength = nums.length;
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            temp.add(nums[i]);
        permutations(temp,"");
        return list;

    }
    public static  void  main(String[] args){
        int[] number = {1,2,3};
        List<List<Integer>> result = permute(number);
        for(List<Integer> temp : result){
            for(Integer i : temp){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
