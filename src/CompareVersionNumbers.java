/**
 * Created by hyh on 2017/5/8.
 */
public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        if(version1 == null || version2 == null || version1.length()<=0 || version2.length()<=0)
            return 0;
        int index1 = 0;
        int index2 = 0;
        int sum1=0,sum2=0;
        while( index1<version1.length() && version1.charAt(index1)!='.' ){
            sum1 = sum1 * 10 + Integer.valueOf(version1.charAt(index1++)-'0');
        }
        while( index2<version2.length() && version2.charAt(index2)!='.'){
            sum2 = sum2 * 10 + Integer.valueOf(version2.charAt(index2++)-'0');
        }
        if(sum1>sum2)
            return 1;
        else if(sum1<sum2)
            return -1;
        index1++;
        index2++;
        sum1= 0;
        sum2=0;
        while(index1<version1.length()){
            sum1 = sum1 * 10 + Integer.valueOf(version1.charAt(index1++)-'0');
        }
        while(index2<version2.length()){
            sum2 = sum2 * 10 + Integer.valueOf(version2.charAt(index2++)-'0');
        }
        if(sum1>sum2)
            return 1;
        else if(sum1<sum2)
            return -1;
        else
            return 0;

    }
    public static void main(String[] args){
        String version1 = "001.001";
        String version2 = "1.0001";
        System.out.println(compareVersion(version1,version2));
    }
}
