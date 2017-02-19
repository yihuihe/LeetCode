import java.util.*;
public class ValidParentheses {
	
	 public static boolean isValid(String s) {
	        List<Character> list = new ArrayList();
	        list.add(s.charAt(0));
	        int length =0;
	        for(int i=1;i<s.length();i++){
	        	char c = s.charAt(i);
	        	length = list.size();
	        	if(length ==0){
	        		list.add(c);
	        		continue;
	        	}
	        	if(list.get(length-1)=='[' && c==']' || list.get(length-1)=='(' && c==')' || list.get(length-1)=='{' && c=='}' ){
	        		list.remove(length-1);
	        	}
	        	else
	        		list.add(c);
	        }
	        if(list.size() == 0)
	        	return true;
	        else
	        	return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t = isValid(")(((())){}({})");
		System.out.println(t);
	}

}
