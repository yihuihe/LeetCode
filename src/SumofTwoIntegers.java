import java.util.Scanner;

public class SumofTwoIntegers {

	public static int getSum(int a,int b){
		int result;
		int xor,and;
		if ((a & b )!=0)
		{
		
			while( (a & b)!=0)
			{
				xor = a ^ b;
				and = (a & b)<<1;
				
				a = and;
				b = xor;	
			}
			result = a ^ b;
		}
		else 
		result = a ^ b;	
		return result;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = getSum(a,b);
		System.out.println(x);
	}

}
