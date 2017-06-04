import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hyh on 2017/6/4.
 */
public class SubSets {
    public static void build(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, int[] s, int start){
        // if(temp.size() == s.length){
        //     list.add(new ArrayList<>(temp));
        //     return ;
        // }
        list.add(new ArrayList<>(temp));
        for(int i=start;i<s.length;i++){
            temp.add(s[i]);
            build(list,temp,s,i+1);
            temp.remove(temp.size()-1);
        }

    }
    public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(S == null || S.length==0)
            return list;
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(S);
        build(list,temp,S,0);
        return list;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> result = subsets(arr);
        System.out.print("hello");
    }
}
