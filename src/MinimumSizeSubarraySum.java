/**
 * Created by hyh on 2017/5/8.
 */
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length<=0)
            return 0;
        if(nums.length==1)
        {
            if(nums[0] == s)
                return 1;
            else
                return 0;
        }

        int fast =0 ;
        int low = 0;
        int sum = nums[low];
        int len = Integer.MAX_VALUE;
        int flag= 0;
        while(fast < nums.length){
            while( fast < nums.length && low<fast){
                if(flag == 0)
                    sum = sum + nums[fast];
                else
                    flag =0;
                if(sum >= s)
                {
                    if(fast-low+1 < len)
                        len = fast -low +1;
                    sum -= nums[low];
                    low++;
                    flag=1;
                }
                else{
                    fast++;
                }
            }
            if(low == fast){
                if(sum >= s){
                    if(fast -low+1 <len)
                        len = fast-low+1;
                }
                fast++;
                flag = 0;
            }
        }
        if(len == Integer.MAX_VALUE)
            len = 0;
        return len;

    }
    public  static void main(String[] args){
        int[] number = {1,1};
        System.out.println(minSubArrayLen(3,number));
    }
}
