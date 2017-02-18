import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyh on 2017/2/18.
 */
public class Sum4II {
    public static int fourSumCount(int[] A,int[] B,int[] C, int[] D){
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int length = A.length;
        int temp1 = 0;
        int temp2 = 0;
        for(int i=0;i<length;i++)
            for(int j=0;j<length;j++){
                temp1 = A[i] + B[j];
                if(!map.containsKey(temp1))
                    map.put(temp1,1);
                else{
                    map.replace(temp1,map.get(temp1)+1);
                }
            }
        for(int k=0;k<length;k++)
            for(int l=0;l<length;l++){
                temp2 = -(C[k] + D[l]);
                if(map.containsKey(temp2))
                    sum += map.get(temp2);
            }

        return sum;

    }

    public static void main(String[] args){
        int[] A = new int[]{1,2};
        int[] B = new int[]{-2,-1};
        int[] C = new int[]{-1,2};
        int[] D = new int[]{0,2};
        System.out.println(fourSumCount(A,B,C,D));

    }
}
