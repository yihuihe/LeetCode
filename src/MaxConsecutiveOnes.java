/**
 * Created by hyh on 2017/2/27.
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==1 )
                count++;
            if(nums[i] ==0)
            {
                max = max > count ? max : count;
                count = 0;
            }
        }
        max = max > count ? max : count;
        return max ;

    }
    public  static  void  main(String[] args){
        int[] temp = new int[]{1,1,0,1,1,1};
        System.out.print(findMaxConsecutiveOnes(temp));
    }
}
