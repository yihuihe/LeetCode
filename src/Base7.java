import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 2017/2/27.
 */
public class Base7 {
    public static String convertToBase7(int num) {
        int mod = 0,yu =-1,count=0,flag=0;
        String result = "";
        List<String> list = new ArrayList<>();
        if(num < 0) {
            num = -num;
            flag =1 ;
        }
        while(yu!=0) {
            mod = num % 7;
            list.add(String.valueOf(mod));
            yu = num / 7;
            num = yu;
        }
        for(int i=list.size()-1;i>=0;i--)
            result += list.get(i).toString();
        if(flag==1)
            result = "-" + result;
        return result;
    }
    public  static void main(String[] args){
        System.out.print(convertToBase7(0));
    }
}
