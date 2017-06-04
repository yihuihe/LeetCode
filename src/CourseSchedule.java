import java.util.*;

/**
 * Created by hyh on 2017/5/17.
 */
public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int k=0,index = 0;
        for(int j=0;j<prerequisites.length;j++)
        {
            k=1;
            index = prerequisites[j][0];
            map.put(index,new ArrayList<Integer>());
            while(k<prerequisites[j].length){
                map.get(index).add(prerequisites[j][k]);
                k++;
            }
        }
        for(Integer key : map.keySet()){
            List<Integer> temp = new ArrayList<Integer>();
            temp = map.get(key);
            Iterator<Integer> it = temp.listIterator();
            while(it.hasNext()){
                int tempNum = it.next();
                if(map.containsKey(tempNum) && map.get(tempNum).contains(key))
                    return false;
            }
        }
        return true;
    }
    public  static  void main(String[] args){
       int[][] num = {{1,0},{0,2},{2,1}};
       System.out.print(canFinish(3,num));

    }

}
