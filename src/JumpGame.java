/**
 * Created by hyh on 2017/5/17.
 */
public class JumpGame {
    public static boolean canJump(int[] nums) {
        if(nums == null || nums.length<=0)
            return false;
        int end = nums.length-1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]+i >=end)
                end = i;
        }
        if(end==0)
            return true;
        else
            return false;

    }
//    private static boolean result = false;
//    public static void Jump(int[] nums,int index,int step){
//        if(index == nums.length-1)
//        {
//            result = true;
//            return ;
//        }
//        for(int i=1;i<=step;i++){
//            if(index+i >= nums.length)
//                break;
//            Jump(nums,index+i,nums[index+i]);
//        }
//    }
//    public static boolean canJump(int[] nums) {
//        if(nums.length<=0 || nums == null)
//            return false;
//        int index = 0;
//        int step = nums[0];
//        Jump(nums,index,step);
//        return result;
//    }
    public static  void  main(String[] args){
        int[] num = {2,3,1,1,4};
        System.out.print(canJump(num));
    }
}
