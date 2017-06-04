import java.util.Arrays;

/**
 * Created by hyh on 2017/5/18.
 */
public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length<=0)
            return 0;
        if(amount == 0)
            return 0;
        int coinNumSum =0;
        int remainSum = amount;
        Arrays.sort(coins);
        while(remainSum >0){
            for(int i=coins.length-1;i>=0;i--){
                if(remainSum>=coins[i]){
                    coinNumSum++;
                    remainSum -=coins[i];
                    break;
                }
            }
            if(remainSum<coins[0])
                break;
        }
        if(remainSum!=0)
            return -1;
        else
            return coinNumSum;
    }
    public static void main(String[] args){
        int[] coins = {186,419,83,408};
        System.out.print(coinChange(coins,6249));
    }
}
