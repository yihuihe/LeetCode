import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTrangle {
	public static int zuheshu(int n,int m){
		long temp = 1;
		for(int i=1;i<=m;i++)
			temp = temp * (n-i+1)/i;
		return (int)temp;
	}
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> toReturn = new ArrayList<List<Integer>>();
		List<Integer> line = new ArrayList<Integer>();
		int result = 0;
		if(numRows== 0)
			return toReturn;
		if(numRows==1)
		{
			line.add(1);
			toReturn.add(line);
			return toReturn;
		}
		line.add(1);
		toReturn.add(line);
		for(int i=1;i<numRows;i++)
		{
			List<Integer> addline = new ArrayList<Integer>();
			for(int j=0;j<=i;j++)
			{
				result = zuheshu(i,j);
				addline.add(result);
			}
			toReturn.add(addline);
		}
		return toReturn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		System.out.println(generate(c));
	}

}
