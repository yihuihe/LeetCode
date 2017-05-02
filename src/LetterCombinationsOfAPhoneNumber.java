import java.util.LinkedList;
import java.util.List;

/**
 * Created by hyh on 2017/5/2.
 */
public class LetterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        String[] nums = new String[]{" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits == null || digits.length()<=0)
            return list;
        list.add("");
        for(int i=0;i<digits.length();i++){
            int temp = Character.getNumericValue(digits.charAt(i));
            if(temp ==0){
                return new LinkedList<>();
            }
            while (list.peek().length()==i){
                String str = nums[temp];
                String tempStr = list.remove();
                for(int j=0;j<str.length();j++) {
                    char charTemp = str.charAt(j);
                    list.add(tempStr+charTemp);
                }
            }
        }
        return list;
    }
    public  static  void  main(String[] args){
        List<String> linkedList = letterCombinations("203");
        for(String s : linkedList)
            System.out.print(s+" ");
        System.out.println();
    }
}
