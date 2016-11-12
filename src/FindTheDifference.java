
public class FindTheDifference {
	
	public static char findTheDifference(String s, String t){
		int s_length = s.length();
		int t_length = t.length();
		int i=0;
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		char toReturn = 0;
		int s_sum =  0,t_sum=0,sum=0;
		for(i=0;i<s_length;i++)
		{
			s_sum += sChar[i];
		}	
		for(i=0;i<t_length;i++)
		{
			t_sum += tChar[i];
		}	
		sum = t_sum - s_sum;
		toReturn = (char)sum;
		return toReturn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char e = findTheDifference("abcd","abcdz");
		System.out.println(e);
	}

}
