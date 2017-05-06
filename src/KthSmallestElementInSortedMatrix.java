/**
 * Created by hyh on 2017/5/6.
 */
public class KthSmallestElementInSortedMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length;
        if(matrix == null || k<1 || k> len * len )
            return Integer.MIN_VALUE;
        int beginNum = matrix[0][0];
        int endNum = matrix[len-1][len-1];
        int sum =0;
        int i =0 ,j=0;
        int midNum =0;
        while(beginNum < endNum){
            i = 0;
            j = len-1;
            midNum =   beginNum +(endNum - beginNum ) /2;
            for(;i<len;i++){
                while(j>=0 && matrix[i][j] > midNum )
                    j--;
                sum += (j+1);
            }
            if(sum < k)
            {
                beginNum = midNum + 1;
                sum=0;
            }
            else
            {
                endNum = midNum ;
                sum=0;
            }


        }
        return beginNum;

    }
    public static void main(String[] args){
        int[][] num = {{1,5,9},{10,11,13},{12,13,15}};
       System.out.println( kthSmallest(num,8));
    }
}
