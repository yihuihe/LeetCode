/**
 * Created by hyh on 2017/5/9.
 */
public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length<=0)
            return 0;
        int begin = timeSeries[0];
        int end = begin+duration-1;
        //int end = 0;
        int timeSum = 0;
        //int count=timeSeries[0];
        for(int i=0;i<timeSeries.length;i++){
            //begin = timeSeries[i];
            if(timeSeries[i] <= end){
                if(timeSeries[i]+duration-1 > end)
                    end = timeSeries[i]+duration-1;
            }
            else{
                timeSum += end - begin +1;
                begin = timeSeries[i];
                end = begin + duration -1;
            }
        }
        timeSum += end -begin +1;
        return timeSum;
    }
    public static void main(String[] args){
        int[] number = {1,2,3,4,5,6,7,8};
        System.out.print(findPoisonedDuration(number,1));
    }
}
