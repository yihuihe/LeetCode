import java.util.HashSet;
import java.util.Set;

/**
 * Created by hyh on 2017/4/19.
 */
public class K_diffPairsInAnArray {
    public static int findPairs(int[] nums, int k) {

        if(nums == null || nums.length<=0 || k<0)
            return 0;
        int sum =0;
        int flag =0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if((Math.abs(nums[i]-nums[j]))==k) {
                    if (!set.contains(nums[j])) {
                        set.add(nums[j]);
                        sum++;
                    }
                }
            }
            //set.add(nums[i]);
        }
        return sum;
    }
    public  static  void  main(String[] args){
        int[] nums = {1,1,1,2,1};
        System.out.print(findPairs(nums,2));
    }
}
