/**
 * Created by hyh on 2017/5/1.
 */
public class ReverseBits {

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n = n >>> 1;
            if (i < 31) {
                result <<= 1;
            }
        }
        return result;
    }
    /*
    public static int reverseBits(int n) {
        if(n == 0 )
            return 0;
        StringBuilder sb = new StringBuilder();
        int compare = 1;
        int count = 0;
        while(count<32){
            int temp = n & compare;
            if(temp != 0)
                sb.append("1");
            else
                sb.append("0");
            compare <<= 1;
            count++;
        }
        String str = sb.reverse().toString();
        long sum = 0;
        for(int i=0;i<str.length();i++){
            sum += Math.pow(2.0,i) * ( str.charAt(i)-'0');
        }
        return (int)sum;
    }
    */
    public  static void main(String[] args){
        System.out.println(reverseBits(4));
    }
}
