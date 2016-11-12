
public class TwoSum {
	public static int[] twoSum(int[] nums,int target){
		int i,j;
		int[] toReturn = new int[2];
		for(i=0;i<nums.length-1;i++)
			for(j=i+1;j<nums.length;j++)
			{
				if(nums[i] + nums[j] == target)
				{
					toReturn[0] = i;
					toReturn[1] = j;
				}
			}
		return toReturn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x =  new int[]{2,7,11,15};
		int[] c = twoSum(x,17);
		for(int i=0;i<2;i++)
			System.out.println(c[i]);
	}

}
