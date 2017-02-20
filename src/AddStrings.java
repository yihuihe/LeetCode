import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 2017/2/20.
 */
public class AddStrings {
    public static  String addStrings(String num1, String num2) {
        if(num1.length() ==0 )
            return num2;
        if(num2.length() ==0)
            return  num1;
        if(num1.length() ==0 && num2.length() ==0)
            return null;
        List<String> list = new ArrayList<>();
        String result ="";
        int Cin =0;
        int a=0,b=0,i=0,j=0;
        for( i=num1.length()-1, j=num2.length()-1; i>=0 || j>=0;i--,j--){
            a = i< 0 ? 0 : num1.charAt(i) - '0';
            b = j< 0 ? 0 :num2.charAt(j) - '0';
            list.add(String.valueOf((a + b + Cin)% 10));
            Cin = (a + b + Cin) / 10;
        }
        if(Cin != 0)
            list.add(String.valueOf(Cin));
        for (int k=list.size()-1;k>=0;k--)
            result += list.get(k);
        return  result;

    }
    public static void main(String[] args){
        System.out.println(addStrings("111199","1"));
    }
}
