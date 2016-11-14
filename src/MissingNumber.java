
public class MissingNumber {
	public static int missingNumber(int[] nums){
		int nums_length = nums.length;
		int toReturn = 0;
		int Index = -1;
		int[] temp = new int[nums_length+1];
		for(int i=0; i<nums_length;i++)
		{
		    Index = nums[i];
			temp[Index] ++;
		}
		for(int i=0; i<temp.length;i++)
		{
			if(temp[i] ==0)
				toReturn = i;
		}
		return toReturn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[]{0};
		int i = missingNumber(c);
		System.out.println(i);
	}

}
