/**
 * Created by hyh on 2017/2/18.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s.equals(""))
            return  0;
        if(s.matches(" *"))
            return 0;
        String ss = s.trim();
        String[] result = ss.split("\\s+");
        return  result[result.length-1].length();
    }

    public static void main(String[] args){
        String str = "   hell    ";
        System.out.println(lengthOfLastWord(str));
    }
}
