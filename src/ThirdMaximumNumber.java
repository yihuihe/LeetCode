public class ThirdMaximumNumber {

	 public  static int thirdMax(int[] nums) {
		 if(nums.length == 0)
			 return 0;
		 int FirstMax=nums[0];
		 Integer SecondMax = null ;
		 Integer ThirdMax = null ;
		 
		 for(int i =0;i <nums.length;i++)
		 {
			 if(nums[i]>FirstMax)
				 FirstMax = nums[i];
		 }
		 for(int j=0;j<nums.length;j++)
		 {
			 if(nums[j]<FirstMax)
			 {
				 if(SecondMax == null)
					 SecondMax = nums[j];
				 else
					 SecondMax = Math.max(SecondMax, nums[j]);
			 }
		 }
		 if(SecondMax == null)
			 return FirstMax;
		 for(int k=0; k<nums.length;k++)
		 {
			 if(nums[k]<SecondMax)
			 {
				 if(ThirdMax == null)
					 ThirdMax = nums[k];
				 else
					 ThirdMax = Math.max(ThirdMax, nums[k]);
			 }
		 }
		 if(SecondMax == null || ThirdMax == null)
			 return FirstMax;
		 else 
			 return ThirdMax;
			 
			
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  c = new int[]{1,2};
		System.out.println(thirdMax(c));
	}

}
