
public class ProductOfArrayExceptSelf {
	
	public static int[] productExceptSelf(int[] nums){
		int[] toReturn = new int[nums.length];
		int result = 1;
		int zero_count = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != 0)
				result *= nums[i];
			else
				zero_count++;
		}
		for(int j=0;j<nums.length;j++)
		{
			if(zero_count ==1)
			{
				if(nums[j]==0)
					toReturn[j] = result;
				else
					toReturn[j] = 0;
			}
			else if(zero_count >= 2)
			{
				toReturn[j] = 0;
			}
			else 
				toReturn[j] = result/nums[j];
		}
			
		return toReturn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[]{0,0,0};
		int[] w = productExceptSelf(c);
		for(int i=0;i<c.length;i++)
			System.out.print(w[i]);
		System.out.println();
	}

}
