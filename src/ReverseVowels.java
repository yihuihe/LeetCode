import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 2017/2/18.
 */
public class ReverseVowels {
    public static String reverseVowels(String s) {
        if(s == null || s.length()==0) return s;
        String temp = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start =0;char temp1 ;
        int end = s.length()-1;
        while(start<end){
            while (start<end && !temp.contains(s.charAt(start)+""))
            {start++;}
            while (start<end && !temp.contains(s.charAt(end)+""))
                end--;
            temp1 = chars[start];
            chars[start] = chars[end];
            chars[end] = temp1;

            start++;
            end--;
        }

        return String.valueOf(chars);
    }
    /*
    public static String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        String ss = "";
        String temp = "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(temp.contains(c+"")) {
                list.add(c);
            }
        }
        int count = list.size();
        for (int j=0;j<s.length();j++){
            char c = s.charAt(j);
            if(temp.contains(c+""))
            {
                ss += list.get(count-1);
                count--;
            }
            else
                ss += c;
        }
        return ss;
    }
    */
    public static void main(String[] args){
        List<Character> list = new ArrayList<>();
        String s = reverseVowels("alrfelgiggonjru");
        System.out.println(s);

    }
}

