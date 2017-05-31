/**
 * Created by hyh on 2017/5/31.
 */
public class SingleNumberII {
    public static int singleNumber(int[] A) {
        if(A==null && A.length<=0)
            return Integer.MIN_VALUE ;
        int[] index = new int[32];
        for(int i=0;i<index.length;i++)
            index[i] = 0;
        int  compare =1;
        int count=0;
        for(int i=0;i<A.length;i++){
            count=0;
            compare =1;
            while(count<32){
                if((compare & A[i])!=0)
                    index[count]++;
                count++;
                compare<<=1;
            }
        }
        int result = 0;
        int temp = 0;
        for(int i=0;i<index.length;i++){
            if(index[i] % 3 !=0)
                temp = (int)Math.pow(2,i);
                result += (int)Math.pow(2,i);
               // result += (index[i] % 3) << i;
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {-2,-2,1,1,-3,1,-3,-3,-4,-2};
        System.out.print(singleNumber(arr));
    }
}
