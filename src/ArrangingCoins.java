/**
 * Created by hyh on 2017/2/20.
 */
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        if(n==0)
            return 0;
        int k=1,m=n;
        while (m>=k){
            m -=k;
            k++;
        }
        return k-1;

    }
    public static void main(String[] args){
        System.out.println(arrangeCoins(6));
    }
}
