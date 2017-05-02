/**
 * Created by hyh on 2017/5/2.
 */
public class ReverseWordsinAString {
    public static String reverseWords(String s) {
        if(s == null || s.length()<=0 || s.matches("\\s+"))
            return "";
        StringBuilder sb = new StringBuilder();
        String[] temp  = s.split("\\s+");

        for(int i=temp.length-1;i>=0;i--){
            sb.append(temp[i]+" ");
        }

        return sb.toString().trim();
    }
    public static void main(String[] args){
        System.out.println(reverseWords("a"));
    }
}
