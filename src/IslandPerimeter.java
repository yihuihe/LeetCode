
public class IslandPerimeter {

	public static int islandPerimeter(int[][] grid){
		int result = 0;
		int sum_one = 0;
		int sum_repeat =0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j] == 1){
					sum_one += 1;
					if(i-1 >=0 && grid[i-1][j]==1) sum_repeat +=1;
					if(i+1 <=grid.length-1 && grid[i+1][j] ==1) sum_repeat +=1;
					if(j-1 >=0 && grid[i][j-1] ==1) sum_repeat +=1;
					if(j+1 <=grid[i].length-1 && grid[i][j+1] ==1) sum_repeat +=1;
				}
			}
		}
		result = 4 * sum_one - sum_repeat;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int result = islandPerimeter(grid);
		System.out.println(result);
	}

}
