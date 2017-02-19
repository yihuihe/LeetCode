
public class ImplementstrStr {


	public static  int strStr(String haystack, String needle) {
        int strLenNeedle =  needle.length();
        int strLenHay = haystack.length();
        
        for(int i=0;i<=strLenHay-strLenNeedle;i++)
        {
        	if(haystack.substring(i, i+strLenNeedle).equals(needle))
        		return i;
        }
        return -1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = strStr("","");
		System.out.println(i);
	}

}
