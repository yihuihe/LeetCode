/**
 * Created by hyh on 2017/5/8.
 */
public class ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        if(nums == null || nums.length<=1)
            return false;
        int[] countSum = new int[nums.length+1];
        for(int i=1;i<=nums.length;i++){
            countSum[i] = countSum[i-1] + nums[i-1];
        }
        for(int i=0;i<countSum.length;i++){
            for(int j=i+2;j<countSum.length;j++){
                if(k==0){
                    if(countSum[j]-countSum[i]==0)
                        return true;
                }
                else{
                    if((countSum[j]-countSum[i]) % k==0)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] number = {23,2,4,6,7};
        System.out.println(checkSubarraySum(number,6));
    }
}
