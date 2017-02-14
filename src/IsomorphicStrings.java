
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s,String t){
	Map<Character,Character> temp = new HashMap<Character,Character>(); 
	for(int i=0;i<s.length();i++){
		char ss = s.charAt(i);
		char tt = t.charAt(i);
		if(!temp.containsKey(ss)){
			if(!temp.containsValue(tt))
				temp.put(ss, tt);
			else
				return false;
		}
		else{
			if(temp.get(ss).equals(tt))
				continue;
			else
				return false;
		}
	}
	return true;
	}
	
	
/*
	public static boolean isIsomorphic(String s,String t){
		int[] sAlphabet = new int[52];
		int[] tAlphabet = new int[52];
		String ss = "";
		String tt = "";
		for(int i=0; i<s.length();i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				sAlphabet[s.charAt(i)-'a'+26]++;
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				sAlphabet[s.charAt(i)-'A']++;
		}
		for(int i=0; i<t.length();i++){
			if(t.charAt(i)>='a' && t.charAt(i)<='z')
				tAlphabet[t.charAt(i)-'a'+26]++;
			if(t.charAt(i)>='A' && t.charAt(i)<='Z')
				tAlphabet[t.charAt(i)-'A']++;
		}
		for(int k=0;k<s.length();k++){
			if(s.charAt(k)>='a' && s.charAt(k)<='z')
				ss += String.valueOf(sAlphabet[s.charAt(k)-'a'+26]);
			if(s.charAt(k)>='A' && s.charAt(k)<='Z')
				ss += String.valueOf(sAlphabet[s.charAt(k)-'A']);
		}

		for(int k=0;k<t.length();k++){
			if(t.charAt(k)>='a' && t.charAt(k)<='z')
				tt += String.valueOf(tAlphabet[t.charAt(k)-'a'+26]);
			if(t.charAt(k)>='A' && t.charAt(k)<='Z')
				tt += String.valueOf(tAlphabet[t.charAt(k)-'A']);
		}
		
		if(ss.equals(tt))
			return true;
		else 
			return false;
	}
*/		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("egg","add"));
	}

}
