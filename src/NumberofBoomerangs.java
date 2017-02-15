import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NumberofBoomerangs {
	public static int distanceofPoints(int[] one,int[] two){
		int x = two[0] - one[0];
		int y = two[1] - one[1];
		return x*x+y*y;
	}

	public static int numberofBoomeranges(int[][] points){
		Map<Integer,HashSet<int[]>> map = new HashMap<Integer,HashSet<int[]>>();
		int sum = 0;
		//System.out.println(twoRow[0]);
		for(int i=0; i<points.length;i++){
			int[] onePoint= points[i];
			for(int j=0;j<points.length;j++){
				int[] twoPoint = points[j];
				if(i==j) continue;
				int distance = distanceofPoints(onePoint,twoPoint);
				if(!map.containsKey(distance)){
					HashSet<int[]> temp = new HashSet<int[]>();
					temp.add(twoPoint);
					map.put(distance,temp);
				}
				else{
					map.get(distance).add(twoPoint);
				}
			}
			for(int ii : map.keySet()){
				int ii_value =map.get(ii).size();
				if(ii_value>=2)
					sum += ii_value * (ii_value-1);
			}
			map.clear();
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = new int[][]{{0,0},{1,0},{2,0}};
		System.out.println(numberofBoomeranges(points));
	}

}
