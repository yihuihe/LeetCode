/**
 * Created by hyh on 2017/2/20.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        String sss = "";
        sss = ss.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int start = 0; int end = sss.length()-1;
        while (start<end){
            if (!(sss.charAt(start) == sss.charAt(end)))
                return false;
            start++;
            end--;
        }
        return true;

    }
    public  static  void main (String[] args){
        boolean t = isPalindrome("A man, a plan, a canal: Panama");
        System.out.print(t);
    }
}
