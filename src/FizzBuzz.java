import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FizzBuzz {
	public static List<String> fizzbuzz(int n) {
		int i=0;
		List<String> userList = new ArrayList<String>(); 
		for(i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				if(i%5==0)
					userList.add("FizzBuzz");
				else
					userList.add("Fizz");
			}
			else if(i%5==0)
			{
				if(i%3==0)
					userList.add("FizzBuzz");
				else
					userList.add("Buzz");
			}
			else
			{
				String num = String.valueOf(i);
				userList.add(num);
			}
		}
		System.out.println(userList);
		return userList;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fizzbuzz(n);
	}

}
