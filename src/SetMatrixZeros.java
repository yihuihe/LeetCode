/**
 * Created by hyh on 2017/5/31.
 */
public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length==0)
            return ;
        int row = matrix.length;
        int col = matrix[0].length;
        int row_flag = 0,col_flag = 0;
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0)
                col_flag=1;
        }
        for(int j=0;j<col;j++){
            if(matrix[0][j]==0)
                row_flag=1;

        }
        for(int i=1;i<row;i++)
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        for(int j=1;j<col;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<row;i++)
                    matrix[i][j]=0;
            }
        }
        for(int i=1;i<row;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<col;j++)
                    matrix[i][j]=0;
            }
        }
        if(col_flag==1){
            for(int i=0;i<row;i++)
                matrix[i][0]=0;
        }
        if(row_flag==1){
            for(int j=0;j<col;j++)
                matrix[0][j]=0;
        }

    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,0,12},{0,14,15,0}};
        setZeroes(arr);
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
