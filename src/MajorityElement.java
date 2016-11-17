import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

	public static int majorityElement(int[] nums){
		Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
		int toReturn =0;
		for(int i=0;i<nums.length;i++)
		{
			int appear_time =0;
			if(!temp.containsKey(nums[i]))
			{
				temp.put(nums[i], 1);
			}
			else
			{
				appear_time = temp.get(nums[i]);
				appear_time ++;
				temp.replace(nums[i],appear_time);
			}
		}
		int  majority_num = nums.length/2;
		//用于HashMap遍历的代码。
		Iterator iter = temp.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			if((int)value > majority_num)
				toReturn = (int)key;
		}
		return toReturn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[]{1,1,2,1,1,2};
		System.out.println(majorityElement(c));

	}

}
