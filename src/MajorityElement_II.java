import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MajorityElement_II {

	public static List<Integer> majorityElement(int[] nums){
		Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
		List<Integer> toReturn = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(!temp.containsKey(nums[i]))
			{
				temp.put(nums[i], 1);
				System.out.println(temp.get(nums[i]));
			}
			else 
			{
				int count = temp.get(nums[i]);
				count ++;
				temp.replace(nums[i], count);
				System.out.println(temp.get(nums[i]));
			}
		}
		int request_num = nums.length/3;
		Iterator iter = temp.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			if((int)value > request_num)
				toReturn.add((int)key);
		}
		return toReturn;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c =new int[]{2,2,4,3,3,3};
		List<Integer> list = new ArrayList<Integer>();
		list = majorityElement(c);
		System.out.println(list);
	}

}
