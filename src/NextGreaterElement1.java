import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 2017/2/27.
 */
public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result  = new int[findNums.length];
        int index = 0,count=0;
        List<Integer> list =  new ArrayList<>();
        for(int j=0;j<nums.length;j++)
            list.add(nums[j]);
        for(int i=0;i<findNums.length;i++){
            index = list.indexOf(findNums[i]);
            while (index<nums.length){
                if(index == nums.length-1){
                    result[count++] = -1;
                    break;
                }
                if(findNums[i] < nums[index+1])
                {
                    result[count++] = nums[index+1];
                    break;
                }
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args){

        int[] s  = new int[]{4,1,2};
        int[] t = new int[]{1,3,4,2};
        for(int i :nextGreaterElement(s,t) )
            System.out.print(i);
    }
}
