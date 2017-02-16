import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static boolean wordPattern(String pattern, String str){
		String[] splitWord = str.split(" ");
		if(pattern.length() != splitWord.length)
			return false;
		Map<Character,String> map = new HashMap();
		for(int i=0;i<splitWord.length;i++){
			if(!map.containsKey(pattern.charAt(i))){
				if(!map.containsValue(splitWord[i]))
					map.put(pattern.charAt(i), splitWord[i]);
				else
					return false;
			}
			else{
				if(!map.get(pattern.charAt(i)).equals(splitWord[i]))
					return false;		
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abba","dog dog dog dog"));
	}

}
