/**
 * Created by hyh on 2017/2/24.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int temp = x ^ y ;
        int count = 0;
        while(temp>0){
        if((temp & 1)==1){
            count++;
        }
        temp >>=1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.print(hammingDistance(1,6));
    }
}
