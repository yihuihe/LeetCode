
public class RangeToInteger {

	public static int romanToInt(String s) {
       int[] temp = new int[s.length()];
       int sum = 0;
       for(int i=0;i<s.length();i++){
    	   char c = s.charAt(i);
    	   switch(c){
    		   case 'I':temp[i] = 1;break;
    		   case 'V':temp[i] = 5;break;
    		   case 'X':temp[i] = 10;break;
    		   case 'L':temp[i] = 50;break;
    		   case 'C':temp[i] = 100;break;
    		   case 'D':temp[i] = 500;break;
    		   case 'M':temp[i] = 1000;break;
    		   default: ;
    	   }
       }
       for(int j=0;j<temp.length-1;j++){
    	   if(temp[j]<temp[j+1])
    		   sum -= temp[j];
    	   else
    		   sum += temp[j]; 
       }
       return sum+temp[temp.length-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("XLVIII"));
	}

}
