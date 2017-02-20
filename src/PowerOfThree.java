/**
 * Created by hyh on 2017/2/20.
 */
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        if(Math.pow(3.0,19)%n ==0.0)
            return true;
        return false;
    }
    public static void main(String[] args){
        boolean t = isPowerOfThree(1);
        System.out.println(t);
    }
}
