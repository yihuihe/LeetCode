import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
	public static boolean containsNearbyDuplicate(int[] nums, int k){
	/*  Time Limit Exceeded
		if(k<0)
			return false;
		for(int i=0;i<nums.length-1;i++)
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j] && j-i <= k)
					return true;
			}
		return false;
	*/
	// use HashMap
	 if(k<=0 || nums.length <=1)
		 return false;
	 Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
	 for(int i=0; i<nums.length;i++)
	 {
		 if(!temp.containsKey(nums[i]))
			 temp.put(nums[i], i);
		 else
		 {
			 if((i - temp.get(nums[i])) <=k)
				 return true;
			 else
				 temp.replace(nums[i], i);
		 }
	 }
	 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[]{};
		System.out.println(containsNearbyDuplicate(c,1));
	}

}
