
public class NumberOf1Bits {
	public static long hammingWeight(int n) {
        int count = 0;
        /*
        for(int i=0;i<32;i++){
        	if(((n >> i) & 1 ) ==1)
        		count++;
        }
        */
        long temp = n & 0xFFFFFFFF;
        while(temp>0){
        	if((temp & 1) == 1)
        		count++;
        	temp>>=1;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(2147483647));
	}

}
