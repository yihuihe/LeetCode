/**
 * Created by hyh on 2017/2/18.
 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String str) {
        int subStringLength =0;
        int flag =1;
        for(subStringLength=1;subStringLength<str.length();subStringLength++) {
            String compare = str.substring(0, subStringLength);
            for (int Index = subStringLength; Index < str.length(); Index += subStringLength) {
                if(Index + subStringLength>str.length()){
                    flag = 0;
                    break;
                }
                if (!str.substring(Index, Index + subStringLength).equals(compare))
                {
                    flag = 0;
                    break;
                }
            }
            if(flag ==1)
                return true;
            else
                flag =1;
        }
        return false;

    }
    public  static  void main(String[] args){
        boolean t = repeatedSubstringPattern("");
        System.out.println(t);
    }

}
