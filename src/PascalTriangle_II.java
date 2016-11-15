/**
 * ������ǵ�n����n��Ԫ�أ���n�е�m�����ɱ�ʾΪ C(n-1,m-1)����Ϊ��n-1����ͬԪ����ȡm-1��Ԫ�ص������
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class PascalTriangle_II {
	/*��ΪInteger�������͵����ƣ����ֻ��ά��13�����ݵ���ȷ�ԣ���������������
	public static int Jiecheng(int i){
		int jiecheng = 1;
		if(i==0)
			return 1;
		for(int j=1;j<=i;j++)
			jiecheng *=j;
		return jiecheng;
	}

	public static List<Integer> getRow (int rowIndex){
	    rowIndex = rowIndex + 1 ;
		List<Integer> toReturn = new ArrayList<Integer>();
		if(rowIndex == 1)
		{
			toReturn.add(1);
			return toReturn;
		}
		int low  = rowIndex -1 ;
		int high = 0;
		int result = 0;
		
		for(int i=1;i<=rowIndex;i++)
		{
			high = i -1 ;
			result = Jiecheng(low)/Jiecheng(low-high)/Jiecheng(high);
			toReturn.add(result);
		}
		return toReturn;
	}
	*/

	//C(n-1,m-1): n-1--> low; m-1-->high  (�����n���Ǵ��������������������ǵ�һ��,����ϰ����������ǵ�0��)
	//��������Ԥ�ȴ�����������33����ȷ
	public static int zuheshu(int n,int m){
		long temp=1 ;
		for(int i=1;i<=m;i++)
		{
			temp = temp *(n-i+1)/i;
		}
		return (int)temp;
	}	
	public static List<Integer> getRow (int rowIndex){
		List<Integer> toReturn = new ArrayList<Integer>();
		int result =0;
		if(rowIndex == 0)
		{
			toReturn.add(1);
			return toReturn;
		}
		for(int i=0;i<=rowIndex;i++)
		{
			result = zuheshu(rowIndex,i);
			toReturn.add(result);
		}
		return toReturn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		System.out.println(getRow(c));
	}

}
