import java.util.ArrayList;

/**
 * Created by hyh on 2017/6/4.
 */
public class PermutationSequence {
    public static int jiecheng(int n){
        int sum =1;
        while(n>0){
            sum = sum * n;
            n--;
        }
        return sum;
    }
    public  static void buildStr(ArrayList<String> list, String str, int n){
        if(str.length()==n){
            list.add(new String(str));
            return ;
        }
        int flag =0;
        for(int i=1;i<=n;i++){
            int index =0;
            flag =0;
            while(index<str.length()){
                if(str.charAt(index)-'0' == i)
                {
                    flag =1;
                    break;
                }
                index++;
            }
            if(flag == 1){
                continue;
            }
            else
                str = str + String.valueOf(i);
            buildStr(list,str,n);
            str = str.substring(0,str.length()-1);
        }
    }
    public static String getPermutation(int n, int k) {
        if(n<=0)
            return "";
        int powValue = jiecheng(n);
        if(powValue < k)
            return "";
        ArrayList<String> list = new ArrayList<>();
        buildStr(list,"",n);
        String result = list.get(k-1);
        return result;

    }
    public static void main(String[] args){
        String result = getPermutation(9,3);
        System.out.println(result);
    }
}
