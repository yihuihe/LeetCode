/**
 * Created by hyh on 2017/2/20.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        String s = String.valueOf(x);
        if(s.length()==0) return 0;
        if(x==0) return 0;
        int fu = 0;
        String temp ="";
        String temp1 = "";
        int flag = 0,result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !='0' && flag==0 )
                flag=1;
            if( flag==1 )
                temp +=s.charAt(i);
        }
        for(int j=temp.length()-1;j>=0;j--)
        {
            if(temp.charAt(j)=='-')
            {
                fu = 1;
                continue;
            }
            temp1 +=temp.charAt(j);
        }
        long l = Long.parseLong(temp1);
        if(l > Integer.MAX_VALUE || l<Integer.MIN_VALUE)
            return 0;
        else {
            if(fu==1)
                result = -(int)l;
            else
                result = (int)l;
        }
        return  result;
    }
    public static void main(String[] args){
        int i = reverse(-123);
        System.out.println(i);
    }
}
