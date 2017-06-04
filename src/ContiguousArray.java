/**
 * Created by hyh on 2017/5/6.
 */
public class ContiguousArray {
    public static  int findMaxLength(int[] nums) {
        if(nums == null || nums.length<=0)
            return 0;
        int sum =0;
        int sumZero = 0;
        int sumOne = 0;
        int index = 0;
        int len = nums.length;
        int temp = 0;
        while(index < len){
            while(index < len && nums[index]==1){
                if(temp == 0)
                    temp = sumZero;
                if(sumZero!=0){
                    sumZero--;
                    index++;
                }
                else{
                    sumOne++;
                    index++;
                }
            }
            if(sumZero == 0)
                sum += 2 * temp;
            else{
                sumZero = 0;
                temp =0;
            }
            while(index < len && nums[index]==0){
                if(temp == 0)
                    temp = sumOne;
                if(sumOne!=0){
                    sumOne--;
                    sum +=2;
                    index++;
                }
                else{
                    sumZero++;
                    index++;
                }
            }
            if(sumOne == 0)
                sum += 2 * temp;
            else{
                sumOne = 0;
                temp =0;
            }
        }
        return sum;
    }
    public  static  void main(String[] args){
        int[] num = {0,1};
        System.out.print(findMaxLength(num));
    }
}
