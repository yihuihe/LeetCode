
public class LongestPalindrome {

	public static int longestPalindrome(String s){
		int result = 0;
		int[] count = new int[52];
		int index = 0,flag =0;
		int sum = 0;
		char[] temp = s.toCharArray();
		for(int k=0; k< temp.length; k++){
			if(temp[k]>='a' && temp[k]<='z'){
				index = temp[k] -'a' +26;
			}
			if(temp[k]>='A' && temp[k]<='Z'){
				index = temp[k] -'A' ;
			}
			count[index] ++ ;
		}
		for(int i=0;i<count.length;i++){
			if(count[i] % 2 !=0)
			{
				sum += count[i] - 1 ;
				flag =1;
			}
			else
				sum += count[i];	
		}
		if(flag ==1 )
			result = sum  + 1 ;
		else 
			result = sum ;
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		s = "cccc";
		int result = longestPalindrome(s);
		System.out.println(result);
	}

}
