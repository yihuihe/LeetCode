
public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums){
		int toReturn =0;
		int count = 1;
		if(nums.length == 0)
			return 0;
		int repeatNum = nums[0];	
		for(int i  = 1; i < nums.length; i ++)
		{
			if(repeatNum != nums[i])
			{	
			     repeatNum = nums[i] ;
			     nums[count] = nums[i]; 
			     count ++;
			 }
		}
		toReturn = count;
		return toReturn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[]{};
		System.out.println(removeDuplicates(c));
	}

}
