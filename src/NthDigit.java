/**
 * Created by hyh on 2017/4/19.
 */
public class NthDigit {
    public static int findNthDigit(int n) {
        if(n<=0)
            return -1;
        int start = 1;
        int len = 1;
        long NumCount = 9;
        int num = n;
        while(num > len * NumCount){
            num -= (len * NumCount);
            len = len + 1;
            NumCount *= 10;
            start *= 10;
        }

        start += (num-1) / len;
        String s = Integer.toString(start);
        return Integer.valueOf(s.charAt((num-1) % len)+"");
       // return Character.getNumericValue(s.charAt((n-1) % len));
    }
    public static void main(String[] args){
        System.out.print(findNthDigit(2147483647));
    }
}
