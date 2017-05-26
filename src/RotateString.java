/**
 * Created by hyh on 2017/5/26.
 */
public class RotateString {
    public static String reverseString(String B,int begin,int end){
        if(begin == end)
            return "" + B.charAt(end);
        char[] charArray = B.substring(begin,end+1).toCharArray();
        char temp=0;
        int start = 0;
        int endIndex = charArray.length-1;
        while(start <= endIndex){
            temp = charArray[endIndex];
            charArray[endIndex] = charArray[start];
            charArray[start] = temp;
            start++;
            endIndex--;
        }
        return String.valueOf(charArray);
    }
    public static String rotateString(String A, int n, int p) {
        // write code here
        if(A == null || A.length() == 0 || p<0 )
            return "";
        int k = p % n;
        if(k == n-1)
            return A;
        String temp1 = reverseString(A,0,k);
        String temp2 = reverseString(A,k+1,n-1);
        String resultTemp = temp1 + temp2;
        return reverseString(resultTemp,0,n-1);
    }

    public static void main(String[] args){
        String str = "ABCDEFGH";
        System.out.println(rotateString(str,8,4));
    }
}
