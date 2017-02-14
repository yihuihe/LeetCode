import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static boolean isHappy(int n){
		int sum = 0;
		Set<Integer> temp = new HashSet<Integer>();
		int m = n;
		while(temp.add(m)){
			while(m != 0){
				sum += (m%10) * (m%10);
				m= m/10;
			}
			if(sum == 1)
				return true;
			else
			{
				m = sum;
				sum =0;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}

}
