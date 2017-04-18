/**
 * Created by hyh on 2017/4/18.
 */
public class ReverseStringII {
    public static String reverse(String s){
        if(s == null || s.length()<=0)
            return "";
        if(s.length() == 1)
            return s;
        char temp = 0;
        char[] tempS = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            temp = tempS[j];
            tempS[j] = tempS[i];
            tempS[i] = temp;
            i++;
            j--;
        }
        return String.valueOf(tempS);


    }
    public static String reverseStr(String s, int k) {
        if( s == null || s.length() <=0 || k<=0 )
            return "";
        int length = s.length();
        int leftLen = 0;
        int index  = 0;
        StringBuilder sb = new StringBuilder();
        String ss = s;
        while(index != length){
            if(length - index <= k){
                sb.append(reverse(ss.substring(index,length)));
                index = length ;
            }
            else{
                String subString = ss.substring(index,index+k);
                sb.append(reverse(subString));

                if(length -index <=2*k){
                    sb.append(ss.substring(index+k,length));
                    index = length ;
                }
                else{
                    sb.append(ss.substring(index+k,index+2*k));
                    index += 2*k;
                }

            }
        }
        return sb.toString();
    }
    public static void main (String[] args){
        String s = "abcde";
        System.out.print(reverseStr(s,2));
    }
}
