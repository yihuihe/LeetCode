/**
 * Created by hyh on 2017/5/9.
 */
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        if(nums == null)
            return 0;
        int begin = 0, end = 0;
        //Arrays.sort(nums);
        int sumOfSubarray = 0;
        int sum =nums[begin];
        int flag = 0;
        while(end < nums.length){
            while(end<nums.length && begin < end){
                if(flag == 0)
                    sum += nums[end];
                else
                    flag = 0;
                if(sum > k){
                    sum -=nums[begin];
                    begin++;
                }
                else if(sum < k){
                    end++;
                }
                else{
                    sumOfSubarray++;
                    sum -=nums[begin];
                    begin++;
                    flag=1;
                }

            }
            if(begin == end){
                end++;
                if(sum == k)
                    sumOfSubarray++;
                flag = 0;
            }
        }
        return sumOfSubarray;
    }
    public static void main(String[] args){
        int[] number = {1,2,1,2,1};
        System.out.println(subarraySum(number,3));
    }
}
