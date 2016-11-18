import java.util.ArrayList;
import java.util.List;

public class Triangle {
	public static int triangle(List<List<Integer>> triangle){
		/*
		int triangle_length = triangle.size();
		int row_location = 0;
		int sum = 0;
		
		if(triangle_length == 0 )
			return 0;
		if(triangle_length ==1)
			return triangle.get(0).get(0);
		
		sum = sum + triangle.get(0).get(0);
		for(int i=1;i<triangle_length;i++)
		{
			List<Integer> temp = new ArrayList<Integer>();
			temp = triangle.get(i);
			if(temp.get(row_location)>temp.get(row_location+1))
			{
				sum += temp.get(row_location+1);
				row_location = row_location +1;
			}
			if(temp.get(row_location)<temp.get(row_location+1))
			{
				sum += temp.get(row_location);
			}
		}
		return sum;
		*/
		int triangle_size = triangle.size();
		List<Integer> data = new ArrayList<Integer>();
		int temp = 0;
		int floor_count =0;
		if(triangle.size()==1)
			return triangle.get(0).get(0);
		for(int i=triangle_size-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(i!=triangle_size-1) //the lowest floor
				{
					if(data.get(floor_count+j) >= data.get(floor_count+j+1))
					{
						temp = data.get(floor_count+j+1) + triangle.get(i-1).get(j);
						data.add(temp);
					}
					if(data.get(floor_count+j) < data.get(floor_count+j+1))
					{
						temp = data.get(floor_count+j) + triangle.get(i-1).get(j);
						data.add(temp);
					}
					
				//	temp = triangle.get(i).get(j) + data.get(floor_count+j);
					//triangle.get(i).get(j)= triangle.get(i).get(j) + data.get(floor_count+j);
				}
				else
				{
					if(triangle.get(i).get(j)>=triangle.get(i).get(j+1))
					{
						temp  = triangle.get(i-1).get(j) + triangle.get(i).get(j+1);
						data.add(temp);
					
					}
					if(triangle.get(i).get(j)<triangle.get(i).get(j+1))
					{
						temp  = triangle.get(i-1).get(j) + triangle.get(i).get(j);
						data.add(temp);
					}
				}
				
			}
			if(i!=triangle.size()-1)
				floor_count += (i+1);
		}
		int i=data.get(data.size()-1);
		return  i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//List<List<Integer>> c = new ArrayList<List<Integer>>();
	//	c= [[2],[3,4],[6,5,7],[4,1,8,3]];
		List<List<Integer>> ch = new ArrayList<List<Integer>>();
		List<Integer> f = new ArrayList<Integer>();
		List<Integer> w = new ArrayList<Integer>();
		List<Integer> q = new ArrayList<Integer>();
		f.add(1);
		w.add(2);w.add(-1);
		q.add(4);q.add(-2);q.add(5);
		ch.add(f);ch.add(w);ch.add(q);
		int c = triangle(ch);
		System.out.println(c);	
	}

}
