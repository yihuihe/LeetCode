/**
 * Created by hyh on 2017/5/18.
 */
public class DecodeString {
    private static int index = 0;
    public static String BuildSubString(String s){
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int newIndex = 0;
        String subString = "";
        int repeatNum = 0;
        while(index<s.length()){
            if(s.charAt(index)==']'){
                return sb.toString();
            }
            if(!(s.charAt(index)>='0' && s.charAt(index)<='9')){
                sb.append(s.charAt(index)+"");
            }
            else{
                while(s.charAt(index)>='0' && s.charAt(index)<='9'){
                    repeatNum = repeatNum * 10 +Integer.valueOf(s.charAt(index)-'0');
                    index++;
                }
                index += 1;
                String temp = BuildSubString(s);
                for(int i=0;i<repeatNum;i++)
                    sb.append(temp);
                repeatNum = 0;
            }
            index++;
        }
        subString = sb.toString();

        return subString;
    }
    public static String decodeString(String s) {
        if (s == null || s.length() <= 0)
            return "";
        String result = BuildSubString(s);
        index = 0;
        return result;
    }

    public static void main(String[] args){
        System.out.print(decodeString("10[leetcode]"));
    }
}
