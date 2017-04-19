/**
 * Created by hyh on 2017/4/19.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <=0)
            return 0;
        int[] result = new int[nums.length];
        int index =0;
        int temp = 0;
        int sum = 0;
        int numCount = 1;
        int resultIndex = 0;
        while(index < nums.length){
            temp = nums[index];
            while((index+1)<nums.length && temp == nums[index+1]){
                index++;
                numCount++;
            }
            index++;
            if(numCount>2){
                int addCount = 2;
                while(addCount>0){
                    result[resultIndex++]=temp;
                    addCount--;
                }
                sum +=2;
            }
            else{
                sum += numCount;
                while(numCount>0){
                    result[resultIndex++]=temp;
                    numCount--;
                }
            }
            numCount = 1;

        }
        System.arraycopy(result,0,nums,0,result.length);
        return sum;
    }
    public static void main(String[] args){
        int[] nums = {-1,-1,-1,2,2,3};
        System.out.print(removeDuplicates(nums));
    }
}
