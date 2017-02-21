
public class PowerOfFour {

	public static boolean isPowerOfFour(int num) {
        if(num<=0)
        	return false;
        int c =0;
        while(num>0){
        	if((num & 3) ==1){
        			c++;
        	}
        	if((num & 3) == 2 || (num & 3) == 3)
        		return false;
        	num >>=2;
        }
        if(c!=1)
        	return false;
        else
        	return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour(6));
	}

}
