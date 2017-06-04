import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 2017/4/19.
 */
public class LongestWordInDictionaryThroughDeleting {
    public static String findLongestWord(String s, List<String> d) {
        if(s == null || s.length() <=0)
            return "";
        int[] alphabet = new int[26];
        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i)-'a']++;
        }
        int maxLen =0;
        String result ="";
        int count =0;
        for(int j=0;j<d.size();j++){
            count = 0;
            String temp = d.get(j);
            int[] array = new int[26];
            System.arraycopy(alphabet,0,array,0,alphabet.length);
            while(count<temp.length()){
                if(array[temp.charAt(count)-'a'] ==0)
                    break;
                else
                    array[temp.charAt(count)-'a']--;
                if(count == temp.length()-1){
                    if(temp.length() > maxLen){
                        maxLen = temp.length();
                        result = temp;
                    }
                    else if(temp.length() == maxLen){
                        if(result.compareTo(temp)>0)
                            result = temp;
                    }

                }
                count++;
            }
        }
        return result;

    }
    public  static  void  main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ewaf");
        list.add("awefawfwaf");
        list.add("awef");
        list.add("awefe");
        list.add("ewafeffeeafewf");
        String s = "aewfafwafjlwajflwajflwafj";
        System.out.print(findLongestWord(s,list));

    }
}
