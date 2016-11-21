
public class MergeSortedArray {

	public static int[] mergeSortedArray(int[] a,int m,int[] b, int n){
		int a_Index = m-1;
		int b_Index = n-1;
		int new_Index = m+n-1;
		while(a_Index>=0 && b_Index >=0)
		{
			if(a[a_Index] > b[b_Index])
				a[new_Index--] = a[a_Index--];
			else 
				a[new_Index--] = b[b_Index--];
		}
		if(a_Index<0)
		{
			while(b_Index>=0)
			{
				a[new_Index--] = b[b_Index--];
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{4,7,0,0,0,0,0};
		int[] b = new int[]{1,2,3,5,9};
		int[] c =mergeSortedArray(a,2,b,5);
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
			
	}

}
