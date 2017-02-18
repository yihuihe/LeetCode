import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyh on 2017/2/18.
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            if(!map.containsKey(magazine.charAt(i)))
                map.put(magazine.charAt(i),1);
            else
                map.replace(magazine.charAt(i),map.get(magazine.charAt(i))+1);
        }
        for(int k=0;k<ransomNote.length();k++){
            if(map.containsKey(ransomNote.charAt(k))){
                if (map.get(ransomNote.charAt(k))>0)
                    map.replace(ransomNote.charAt(k),map.get(ransomNote.charAt(k))-1);
                else
                    return false;
            }
            else
                return false;
        }
        return true;
    }
    public  static void main(String[] args){
        boolean t = canConstruct("v","fa");
        System.out.println(t);
    }
}
