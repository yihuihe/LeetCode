
public class NumberOf1Bits {
	public static int hammingWeight(int n) {
        int count = 0;

        for(int i=0;i<32;i++){
        	if(((n >>> i) & 1 ) ==1)
        		count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(256));
	}

}
