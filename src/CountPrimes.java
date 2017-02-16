
public class CountPrimes {

	public static int countPrime(int n){
		//ËØÊıÉ¸·¨
		boolean[] prime = new boolean[n+1];
		int sum =0;
		for(int i=2;i<n;i++){
		  prime[i] =true;
		}
		for(int i=2;i*i<=n;i++){
			if(prime[i]){
				for(int j=i+i;j<n;j+=i)
					prime[j]=false;
			}
		}
		for(int k=2;k<n;k++)
		{
			if(prime[k])
				sum+=1;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrime(12));
	}

}
