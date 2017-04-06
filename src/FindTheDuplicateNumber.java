/**
 * Created by hyh on 2017/4/6.
 */
public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int low = 1;
        int hi = nums.length - 1;
        int mid = 0;
        int count = 0;
        while (low < hi) {
            mid = (low + hi) / 2;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;
            }
            if (count <= mid)
                low = mid + 1;
            else
                hi = mid ;
            count = 0;
        }
        return low;
    }
    public static  void main(String[] args){
        int[] num = {1,3,4,2,2};
        System.out.println(findDuplicate(num));
    }
}
