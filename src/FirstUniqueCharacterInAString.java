import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyh on 2017/2/27.
 */
public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(int j=0;j<s.length();j++){
            if((map.get(s.charAt(j))) == 1){
                return j;
            }
        }
        return -1;

    }
    public  static void  main(String[] args){
        System.out.print(firstUniqChar("loveleetcode"));
    }
}
