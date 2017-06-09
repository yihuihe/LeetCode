import java.util.ArrayList;
import java.util.List;


public class KeyboardRow {
	/*
	public static String[] PrintWord(String[] words) {
		ArrayList<String> result = new ArrayList<>();
		if(words == null || words.length==0)
			return new String[0];
		int lastRow = -1;
		int row = -1;
		int count=0;
		String[] compare = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		for(int i=0;i<words.length;i++)
		{
			String temp = words[i].toLowerCase();
			lastRow =-1;
			for(int j=0;j<temp.length();j++){
				count=0;
				while(count<3){
					if(compare[count++].indexOf(temp.charAt(j))>-1)
						{
							row = count-1;
							break;
						}
				}
				if(lastRow == -1)
					lastRow =row;
				else{
					if(lastRow != row)
						break;
				}
			}
			if(lastRow == row)
				result.add(words[i]);
		}
		return result.toArray(new String[result.size()]);
	}
	*/
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
