/**
 * Created by hyh on 2017/2/22.
 */
public class SqrtX {
    public static int mySqrt(int x) {
        long lo =0,hi=x,mid =-1;
        long last = -2;
        if(x==1) return 1;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if(last!=mid)
                last = mid;
            else
                return (int)mid;
            if (mid * mid == x)
                return (int)mid;
            else {
                if (mid * mid > x)
                    hi = mid;
                else{
                    lo = mid;
                }
            }

        }
        return -1;
    }
    public  static void main(String[] args){
        System.out.print(mySqrt(16));
    }
}
