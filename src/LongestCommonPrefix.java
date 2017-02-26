
public class LongestCommonPrefix {

	public  static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        int length = 0;
        int index = 0;
        for(int i=0;i<strs.length;i++){
        	if(!(strs[i].equals("") || strs[i].equals(null)) )
        	{
        		length = prefix.length() <= strs[i].length() ? prefix.length() : strs[i].length();
        		for( index=0;index<length;index++){
        			if(prefix.charAt(index) != strs[i].charAt(index))
        				break;
        		}
        		prefix = prefix.substring(0, index);
        	}
        	else
        		prefix = "";
        }
        return prefix;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] temp = new String[]{"abc","abcd",""};
		System.out.println(longestCommonPrefix(temp));
	}

}
