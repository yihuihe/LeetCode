import java.util.ArrayList;
import java.util.List;


public class KeyboardRow {
	public static String[] PrintWord(String[] words){
		List<String> temp = new ArrayList<String>();
		int count = 0;
		for(int i=0;i<words.length;i++){
			if(words[i].toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
				temp.add(words[i]);
			}
		}
		String[] result = new String[temp.size()];
		for(String str : temp ){
			result[count++] = str;
		}
		
		return result;
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String[] printResults = PrintWord(words);
		for(int j=0;j<printResults.length;j++){
			System.out.println(printResults[j]);
		}
	}

}
