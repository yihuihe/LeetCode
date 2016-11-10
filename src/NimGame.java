import java.util.Scanner;

public class NimGame {

	public static boolean canWinNim(int n){
		boolean l;
		if (n%4 ==0)
		{
			l = false; 
			System.out.println(l);
			return false;
		}
		else 
		{
			l = true;
			System.out.println(l);
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		canWinNim(n);
	}

}

