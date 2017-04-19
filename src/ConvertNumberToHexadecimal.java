/**
 * Created by hyh on 2017/4/19.
 */
public class ConvertNumberToHexadecimal {
    public static String toHex(int num) {
        if(num == 0)
            return "0";
        int count = 8;
        int compare = 15;
        int temp =0;
        StringBuilder sb = new StringBuilder();
        while(count >0){
            temp = num & compare;
            if(temp>=0 && temp<=9)
                sb.append(String.valueOf(temp));
            else{
                switch(temp){
                    case 10:sb.append("a");break;
                    case 11:sb.append("b");break;
                    case 12:sb.append("c");break;
                    case 13:sb.append("d");break;
                    case 14:sb.append("e");break;
                    case 15:sb.append("f");break;
                    default: ;
                }
            }
            count--;
            num >>>= 4;
        }
        String result_temp =sb.reverse().toString();
        int bitCount =0;
        while (result_temp.charAt(bitCount)=='0')
            bitCount++;
        return result_temp.substring(bitCount,result_temp.length());
    }
    public  static  void main(String[] args){
        System.out.print(toHex(26));
    }
}
