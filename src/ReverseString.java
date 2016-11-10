import java.util.Scanner;

public class ReverseString {

	public static  String reverseString(String s){
	// Solution 1: Time Limit Exceeded
		/*
		char temp[] = s.toCharArray();
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse + temp[i];
		}
		System.out.println(reverse);
		return  reverse;
		*/
		
		 StringBuffer str = new StringBuffer();
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 str.append(s.charAt(i));
		 }
		 System.out.println(str);
		 String toReturn = str.toString();
		 return toReturn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		reverseString(s);
	}

}
