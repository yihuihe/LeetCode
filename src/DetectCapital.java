/**
 * Created by hyh on 2017/2/23.
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if(word.equals("") || word.equals(null)) return false;
        int count =0,flag=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                if(i==0) flag=1;
                count++;
            }
        }
        if(count == word.length()) return true;
        if(count ==1 && word.length()>1 && flag==1) return true;
        if (count == 0) return true;
        return false;
    }
    public  static  void main(String[] args){
        System.out.print(detectCapitalUse("ggggggG"));
    }
}
