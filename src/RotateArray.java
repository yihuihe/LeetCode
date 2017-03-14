
public class RotateArray {

	public static int[] rotate(int[] nums,int k){
		if(nums==null || nums.length==0 ||  k<0)
			return nums;
		int k_temp = k;
		if(k_temp>nums.length)
			k_temp %= nums.length;
		int[] result= new int[nums.length];
		for(int i=0; i<k_temp; i++){
			result[i] = nums[nums.length-k_temp+i];
		}
		for(int j=0; j<nums.length-k_temp; j++){
			result[j+k_temp] = nums[j];
		}
		System.arraycopy(result,0,nums,0,nums.length);
		return nums;
		/*
		int nums_length = nums.length;
		int[] temp = new int[nums_length];
		int k_receive = k % nums_length; 
		int i = 0,count=0;
		if(k==0)
		{
			temp = nums;
			for(i=0;i<temp.length;i++)
				System.out.print(temp[i]);
			System.out.println();
			return temp;
		}
		for (i=nums.length-k_receive;i<=nums.length-1;i++)
		{
			temp[count] = nums[i];
			count ++;
		}
		for(i=0;i<nums.length-k_receive;i++)
		{
			temp[count] = nums[i];
			count++;
		}
		count = 0;
		return temp;
		*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] x = new int[]{1,2,4,7,43,5};
		int[] c = rotate(x,3);
		for(i=0;i<c.length;i++)
			System.out.print(c[i]);
	}

}
