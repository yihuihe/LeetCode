
public class ValidAnagram {

	public static boolean isAnagram(String s, String t){
		int[] alphabet = new int[26];
		for(int i=0;i<s.length();i++) 
			alphabet[s.charAt(i)-'a'] ++;
		for(int j=0;j<t.length();j++)
			alphabet[t.charAt(j)-'a'] --;
		for(int k=0;k<26;k++)
		{
			if(alphabet[k] !=0)
				return false;
		}
		return true;
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		String t = "";
		System.out.println(isAnagram(s,t));
	}

}
