/**
 * Created by hyh on 2017/5/26.
 */
public class GoStep {
    public static  int countWays(int n) {
        // write code here
        if(n<=0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int f1 = 1;
        int f2 = 2;
        int count=2;
        int temp = 0;
        while(count<n){
            count++;
            f1 = f1 % 1000000007;
            f2 = f2 % 1000000007;
            //temp = (f1 + f2) ;
            temp = f1 +f2;
            f1 = f2 ;
            f2 = temp;
        }
        return f2 % 1000000007;
    }
    public static void main(String[] args){
        System.out.println(countWays(10000000));
    }
}
