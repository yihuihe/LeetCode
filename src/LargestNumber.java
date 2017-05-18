import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by hyh on 2017/5/18.
 */
public class LargestNumber {
    public static String largestNumber(int[] nums) {
        if(nums == null || nums.length<=0)
            return "";
        String[] number = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            number[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1+o2;
                String str2 = o2+o1;
                return str1.compareTo(str2);
            }
        };
        Arrays.sort(number,comparator);
        StringBuilder sb = new StringBuilder();
        for(int j=number.length-1;j>=0;j--){
            sb.append(number[j]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        int[] nums= {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}
