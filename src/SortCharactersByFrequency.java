import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hyh on 2017/2/23.
 */
public class SortCharactersByFrequency {
    public  static  String frequencySort(String s){
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        if(s.equals("") || s.equals(null))
            return  "";
        for(int i=0;i<s.length();i++){
            char  c = s.charAt(i);
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.replace(c,map.get(c)+1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = 0;
        List<Character>[] list = new List[s.length()+1];
        for(Character ch : map.keySet()){
            int frequency = map.get(ch);
            if(list[frequency] == null){
                list[frequency] = new ArrayList<>();
            }
            list[frequency].add(ch);
        }
        for(int k=list.length-1;k>=0;k--){
           if(list[k] !=null){
               for (int m=0;m<list[k].size();m++){
                   length =k;
                   while(length>0) {
                       stringBuilder.append(list[k].get(m));
                       length--;
                   }
               }
           }

        }
        return  stringBuilder.toString();
    }
    public  static  void  main(String[] args){
        System.out.println(frequencySort("Aabb"));
    }
}
