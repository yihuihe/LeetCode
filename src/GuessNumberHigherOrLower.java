/**
 * Created by hyh on 2017/5/1.
 */
public class GuessNumberHigherOrLower {
    public static int guess(int num,int n){
        if(num > n)
            return -1;
        else if(num < n)
            return 1;
        else
            return 0;
    }
    public static int guessNumber(int n) {
        if(n < 0)
            return 0;
        int begin =1;
        int end = n;
        int mid = begin + (end -begin)/2;
        int guessResult = -2;
        int result =-1;
        while(begin < end){
            guessResult = guess(mid,1);
            if(guessResult == -1)
                end = mid;
            else if(guessResult == 0)
            {
                result = mid;
                break;
            }
            else if(guessResult == 1)
                begin = mid +1;
            mid = begin +(end - begin )/2;
        }
        return mid;
    }
    public  static void main(String[] args){
        System.out.print(guessNumber(10));
    }
}
