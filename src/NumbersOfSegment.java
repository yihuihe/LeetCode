/**
 * Created by hyh on 2017/2/18.
 */
public class NumbersOfSegment {
    public static  int countSegments(String s) {
        if (s.equals(""))
            return  0;
        if(s.matches(" *"))
            return 0;
        String ss = s.trim();
        String[] result = ss.split("\\s+");
        return  result.length;

    }
    public  static void main(String[] args){
        String str = "           ";
        System.out.println(countSegments(str));
    }
}
