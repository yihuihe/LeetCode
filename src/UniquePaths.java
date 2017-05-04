/**
 * Created by hyh on 2017/5/3.
 */
public class UniquePaths {
    public static long n_jie(int num){
        if(num == 0)
            return 1;
        long result = 1;
        while(num>0){
            result *= num;
            num--;
        }
        return result;
    }
    public static int uniquePaths(int m, int n) {
        if(m<1 || n<1)
            return 0;
        if(m==1 && n==1)
            return 1;
        int swap = 0;
        if(m>n){
            swap = m;
            m = n;
            n = swap;
        }
        //Cm^n = m!/n!(m-n)!
        int mm = m+n-2;   // m
        int nn = m-1;     // n
        int temp = n-1;   // m-n

        long m_n_jie = n_jie(temp);
        int result = 1;
        while(temp>0){
            result *=mm;
            mm--;
            temp--;
        }
        return (int)(result/m_n_jie);
    }
    public static void main(String[] args){
        System.out.println(uniquePaths(1,100));
    }
}
