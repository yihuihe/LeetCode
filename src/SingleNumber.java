import java.util.Scanner;

public class SingleNumber {
	public static int singleNumber(int[] nums){
		int numReturn;
		for(int i=0;i<nums.length-1;i++)
			nums[i+1] = nums[i] ^ nums[i+1];
		return numReturn = nums[nums.length-1];	
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] inNum = new int[3];
		for(int i=0;i<3;i++)
			inNum[i] = sc.nextInt();
		int num = singleNumber(inNum);
		System.out.println(num);
	}
}
