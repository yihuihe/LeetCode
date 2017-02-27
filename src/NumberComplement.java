/**
 * Created by hyh on 2017/2/27.
 */
public class NumberComplement {
    public static  int findComplement(int num) {
        int count =0;
        double sum =0.0;
        int[] temp  = new int[32];
        while (num>0){
            if((num & 1)==1)
                temp[count++] = 0;
            else
                temp[count++] = 1;
            num >>=1;
        }
        for(int i=0;i<count;i++){
            sum += Math.pow(2,i) * temp[i];
        }
        return (int) sum;
    }
    public  static  void  main(String[] args){
        System.out.println(findComplement(3));
    }
}
