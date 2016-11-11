import java.util.Scanner;

public class AddDigits {

	public static int addDigits(int num){
		double shang,yushu,sum=0.0;
		double count=0.0;
		int num_temp;
		
		while(true)
		{
			num_temp = num;
			shang = num_temp /10;
			if (num_temp<10)
			{
				return num_temp;
			}
			while(shang!=0)
			{
				shang = num_temp/10;
				yushu = num_temp % 10;
				sum += yushu;
				num_temp = (int)shang;
				
			}
			if((int)sum / 10 ==0)
				break;
			else
			{
				num = (int)sum;
				sum=0.0;
			}
		}
		return (int)sum;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = addDigits(num);
		System.out.println(x);
	}

}
