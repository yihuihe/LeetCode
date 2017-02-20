/**
 * Created by hyh on 2017/2/20.
 */
public class UglyNumber {
    public static boolean isUgly(int num) {
        if(num <=0)
            return false;
        if(num==1 )
            return  true;
        int[] nums = new int[]{2,3,5};
        int count =0,m=num;
        while (m/nums[count] !=0){
            if(!(m % nums[count] == 0)){
                count ++;
                if(count == 3)
                    return false;
            }
            else{
                m = m / nums[count];
                count = 0;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println(isUgly(21));
    }

}
