
public class PowerOfTwo {

	public static boolean isPowerOfTwo(int n) {
        if(n<=0)
        	return false;
        int c =0;
        for( c=0; n!=0; c++){
        	n &= n-1 ;
        }
        if(c!=1)
        	return false;
        else
        	return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(16));
	}

}
