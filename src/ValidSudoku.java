import java.util.HashSet;
import java.util.Set;

/**
 * Created by hyh on 2017/5/17.
 */
public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        if(board == null || board.length==0 || board[0].length==0)
            return false;

        for(int i=0;i<board.length;i++){

            Set<Integer> rowCount = new HashSet<>();
            Set<Integer> columnCount = new HashSet<>();
            Set<Integer> cellCount = new HashSet<>();
            int temp;
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    temp = board[i][j] - '0';
                    if (!rowCount.add(temp))
                        return false;
                }
                if(board[j][i]!='.'){
                    temp = board[j][i] - '0';
                    if (!columnCount.add(temp))
                        return false;
                }
                int rowIndex = (i/3)*3;
                int columnIndex = (i%3)*3;
                if(board[rowIndex+j/3][columnIndex+j%3]!='.'){
                    temp = board[rowIndex+j/3][columnIndex+j%3] - '0';
                    if(!cellCount.add(temp))
                        return false;
                }

            }
        }
        return true;

    }
    public static void main(String[] args){
        char[][] board = {
                {'.','.','5','.','.','.','.','.','6'},
                {'.','.','.','.','1','4','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','9','2','.','.'},
                {'5','.','.','.','.','2','.','.','.'},
                {'.','.','.','.','.','.','.','3','.'},
                {'.','.','.','5','4','.','.','.','.'},
                {'3','.','.','.','.','.','4','2','.'},
                {'.','.','.','2','7','.','6','.','.'}
        };

        System.out.print(isValidSudoku(board));


    }
}
