import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

	public static List<Integer> findAnagrams(String s,String p){
		List<Integer> result = new ArrayList<Integer>();
		int[] alphabet = new int[26];
		boolean flag = true;
		for(int i=0; i<=s.length()-p.length();i++){
			for(int k=0;k<p.length();k++){
				alphabet[p.charAt(k)-'a']++;
			}
			String subStr = s.substring(i,i+p.length());
			for(int j=0;j<subStr.length();j++){
				alphabet[subStr.charAt(j)-'a']--;
			}
			for(int j=0;j<alphabet.length;j++){
				if(alphabet[j] !=0){
					flag = false;
					alphabet[j] = 0;
				}
			}
			if(flag == true)
				result.add(i);
			flag = true;
			
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="cbaebabacd";
		String p = "acb";
		List<Integer> result = findAnagrams(s,p);
		for(int i : result)
			System.out.println(i);
	}

}
