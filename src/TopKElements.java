import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hyh on 2017/2/18.
 */
public class TopKElements {
        public static List<Integer> topKFrequent(int[] nums, int k) {
            List<Integer>[] list = new List[nums.length+1];
            List<Integer> result = new ArrayList<>();
            Map<Integer,Integer> map = new HashMap<>();
            if(nums.length ==1){
                result.add(nums[0]);
                return result;
            }
            for(int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i]))
                    map.put(nums[i],1);
                else
                    map.replace(nums[i],map.get(nums[i])+1);
            }
            int frequency = 0;
            for(int i : map.keySet()){
                frequency = map.get(i);
                if(list[frequency] == null){
                    list[frequency] = new ArrayList<>();
                }
                list[frequency].add(i);
            }
            int count =0;
            for(int j=list.length-1;j>=0 && result.size()<=k;j--){
                if(list[j] != null){
                    if(list[j].size()< k-result.size())
                        result.addAll(list[j]);
                    else{
                        count = k-result.size();
                        int index =0;
                        while(count>0){
                            result.add(list[j].get(index++));
                            count--;
                        }
                    }
                }
            }
            return result;
        }
    public  static  void main(String[] args){
        int[] numbers = new int[]{1,1,1,2,2,3};
        List<Integer> list = topKFrequent(numbers,2);
        for(int i : list)
            System.out.println(i);
    }
}
