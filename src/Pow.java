/**
 * Created by hyh on 2017/5/18.
 */
public class Pow {
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        double ans = 1;
        while (N > 0) {
            if ((N & 1) == 1) ans *= x;
            x *= x;
            N >>= 1;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(myPow(100,1000));
    }
}
