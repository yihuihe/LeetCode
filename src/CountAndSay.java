/**
 * Created by hyh on 2017/5/10.
 */
public class CountAndSay {
    public static String getString(String s){
        StringBuilder sb = new StringBuilder();
        int begin =0;
        int end =0;
        char temp = 0;
        int count=1;
        while(end<s.length()){
            temp = s.charAt(end);
            if(end+1 <s.length()) {
                if(temp != s.charAt(end+1))
                {
                    sb.append(count);
                    sb.append(Integer.valueOf(temp-'0'));
                    end++;
                    //begin=end;
                }
                else{
                    while(end+1<s.length() && temp == s.charAt(end+1)){
                        count++;
                        end++;
                    }
                    sb.append(count);
                    sb.append(Integer.valueOf(temp-'0'));
                    count=1;
                    end++;
                }
            }
            else{
                sb.append(count);
                sb.append(Integer.valueOf(temp-'0'));
                end++;
            }
        }
        return sb.toString();


    }
    public static String countAndSay(int n) {
        if( n < 1)
            return "";
        if( n ==1)
            return "1";
        String s = "1";
        int count=1;
        while(count<n){
            s = getString(s);
            count++;
        }
        return s;
    }
    public static void main(String[] args){
        System.out.print(countAndSay(2));
    }
}
