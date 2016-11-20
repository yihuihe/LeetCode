
public class RemoveElement {

	public static int removeElement(int[] nums, int val){
		int count =0 ;
		if(nums.length == 0)
			return 0;
		if(nums.length == 1 )
		{
		    if(val == nums[0])
		    {
			    nums[0] = 0;
		    	return 0;
		    }
		   if(val != nums[0])
		    {
		        nums[count++] = nums[0];
		        return 1;
		    }
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==val)
				continue;
			else
			{
				nums[count++] = nums[i];
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c =new int[]{1};
		System.out.println(removeElement(c,1));
	}

}
