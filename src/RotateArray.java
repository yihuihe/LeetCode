
public class RotateArray {

	public static void reserve(int[] array,int start,int end){
		if(array==null || array.length == 0 || start<0 || end > array.length-1 )
			return ;
		int temp = 0;
		while(start < end ){
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			start++;
			end--;
		}

	}
	public static int[] rotate(int[] nums,int k){

		//方法二
		if(nums==null || nums.length==0 ||  k<0)
			return nums;
		if(k>nums.length)
			k = k % nums.length;
		int preLength = nums.length - k;


		reserve(nums,0,preLength-1);
		reserve(nums,preLength,nums.length-1);
		reserve(nums,0,nums.length-1);
		return nums;


		//方法一改进
		/******************************************************************
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
		 ********************************************************************/

		//方法一
		/**********************************************************************
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
		***********************************************************************/
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
