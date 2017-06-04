import java.util.HashSet;
import java.util.Set;

/**
 * Created by hyh on 2017/4/18.
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length <= 0)
            return null;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(set.contains(nums[i]))) {
                set.add(nums[i]);
            }
        }
        return  new int[2];
    }
}
