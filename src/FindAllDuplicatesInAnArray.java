import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
	public static List<Integer> findAllDuplicates (int[] nums){
		List<Integer> toReturn = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int Index = Math.abs(nums[i])-1;
			if(nums[Index]<0)
				toReturn.add(Index+1);
			nums[Index] = -nums[Index];
		}
	
		return toReturn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[]{4,1,2,7,8,2,3,1};
		System.out.println(findAllDuplicates(c));
	}

}
