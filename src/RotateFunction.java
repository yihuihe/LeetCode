/**
 * Created by hyh on 2017/5/7.
 */
public class RotateFunction {
    public static int maxRotateFunction(int[] A) {
        if(A == null || A.length<=0)
            return 0;
        int len = A.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;
        int sum = 0;
        while( count < len){
            for(int i=0;i<A.length;i++){
                if(index == A.length-1){
                    if(i!=A.length-1){
                        sum += i * A[index];
                        index = 0;
                    }
                    else
                        sum += i * A[index];

                }
                else{
                    if(i==len-1)
                        sum += i * A[index];
                    else
                        sum += i * A[index++];
                }
            }
            if(sum>max)
                max = sum;
            sum=0;
            count++;
        }
        return max;
    }
    public  static void main(String[] args){
        int[] num = {4,3,2,6};
        System.out.print(maxRotateFunction(num));
    }
}
