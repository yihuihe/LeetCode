import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public static List<Integer> findDisappearedNumbers(int[] nums){
		List<Integer>  toReturn = new ArrayList<Integer>();
		int i = 0;
		for(i=0;i<nums.length;i++)
		{
			int Index = Math.abs(nums[i]) - 1;
			if(nums[Index] >= 0)
			{
				nums[Index] = -nums[Index];
			}
		}
		for(i=0;i<nums.length;i++)
		{
			if(nums[i]>0)
			{
				toReturn.add(i+1);
			}
		}
		return  toReturn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{7,3,2,5,8,6,2,3};
		List<Integer> c = new ArrayList<Integer>();
		c = findDisappearedNumbers(nums);
		System.out.println(c);
	}

}
