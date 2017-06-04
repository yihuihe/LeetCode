import java.util.ArrayList;

/**
 * Created by hyh on 2017/6/4.
 */
public class Combinations {
    public static void findCombine(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, int k, int start, int n){
        if(temp.size() == k)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            //ArrayList<Integer> tempResult = new ArrayList<>(temp);
            //tempResult.add(start);
            findCombine(list,temp,k,i+1,n);
            temp.remove(temp.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> arr  = new ArrayList<>();
        if(n<=0 || k>n || k==0)
            return arr;
        ArrayList<Integer> temp = new ArrayList<>();
        findCombine(arr,temp,k,1,n);
        return arr;
    }
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> arr = combine(4,2);
        System.out.print("hello");
        String s ="";

    }
}
