/**
 * Created by hyh on 2017/5/4.
 */
public class StringToInteger {
    public static int myAtoi(String str) {
        if(str == null || str.length()<=0)
            return 0;
        long sum =0;
        int flag = 0;
        str = str.trim();
        for(int i=0;i<str.length();i++){
            if( i == 0 && str.charAt(i) == '+' ) {
                continue;
            }
            if( i== 0 && str.charAt(i) == '-'){
                flag = 1;
                continue;
            }

            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                sum = sum  * 10 + (str.charAt(i) - '0');
                if(flag ==1 && (-sum)<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                if(flag ==0 && sum > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            }
            else{
                if(flag ==1)
                    return (int)(-sum);
                else
                    return (int)sum;
            }

        }
        if(flag ==1)
            return (int)(-sum);
        else
            return (int)sum;


    }

    public  static void main(String[] args){
        String temp  = "-2.3";
        System.out.print(myAtoi(temp));
    }
}
