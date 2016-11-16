import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums){
		Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(!temp.containsKey(nums[i]))
				temp.put(nums[i], i);
			else
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c =new int[]{1,2,3,5,6,4,4,4};
		System.out.println(containsDuplicate(c));
	}

}
