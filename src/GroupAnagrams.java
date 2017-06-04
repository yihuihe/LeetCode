import java.util.*;

/**
 * Created by hyh on 2017/5/17.
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs == null || strs.length<=0)
            return list;
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tempStr = String.valueOf(temp);
            if(!map.containsKey(tempStr))
                map.put(tempStr,new ArrayList<>());
            map.get(tempStr).add(strs[i]);
        }
        for(String listTemp : map.keySet())
            list.add(map.get(listTemp));
        return list;
    }

    public  static  void main(String[] args){
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = new ArrayList<>();
        list = groupAnagrams(str);
        for(List temp : list) {
            Iterator<String> stringIterator = temp.iterator();
            while (stringIterator.hasNext()){
                System.out.print(stringIterator.next());
            }
            System.out.println();
        }

    }
}
