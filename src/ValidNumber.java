/**
 * Created by hyh on 2017/5/31.
 */
public class ValidNumber {
    public static boolean isNumber(String s) {
        if(s == null || s.equals(" "))
            return false;
        s =s.trim();
        String compare = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
        if(s.matches(compare))
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        String str = "1";
        System.out.print(isNumber(str));
    }
}

