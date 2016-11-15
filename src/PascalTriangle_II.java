/**
 * 杨辉三角第n行有n个元素，第n行的m个数可表示为 C(n-1,m-1)，即为从n-1个不同元素中取m-1个元素的组合数
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class PascalTriangle_II {
	/*因为Integer数据类型的限制，最多只能维持13行数据的正确性（从上往下数）。
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

	//C(n-1,m-1): n-1--> low; m-1-->high  (这里的n行是从最顶上往下数，最顶上那行是第一行,而练习中最顶上那行是第0行)
	//采用这种预先处理，可以做到33层正确
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
