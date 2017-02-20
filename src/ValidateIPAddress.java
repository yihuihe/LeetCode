/**
 * Created by hyh on 2017/2/20.
 */
public class ValidateIPAddress {
    public static  boolean validIPv4(String IP){
        if(IP.equals(""))
            return false;
        else if(IP.charAt(0)=='.' || IP.charAt(IP.length()-1)=='.')
            return false;
        String[] str = IP.split("\\.");
        if(str.length!=4)
            return  false;
        int temp  = -1;
        for(int i=0;i<str.length;i++){
            if(str[i].length()>1 && str[i].charAt(0)=='0')
                return false;
            if(!(str[i].matches("[0-9]{1,3}")))
                return false;
            temp = Integer.parseInt(str[i]);
            if(temp<0 || temp>255)
                return false;
        }
        return  true;
    }
    public  static boolean validIPv6(String IP){
        if(IP.equals(""))
            return false;
        else if(IP.charAt(0)==':' || IP.charAt(IP.length()-1)==':')
            return false;
        String[] str = IP.split(":");
        if(str.length !=8)
            return false;
        for(int j=0;j<str.length;j++){
            if(str[j].length()<=0 || str[j].length()>4)
                return  false;
            if(!(str[j].matches ("[0-9a-fA-F]{1,4}")))
                return false;
        }
        return  true;
    }
    public static  String validIPAddress(String IP) {
        if(validIPv4(IP))
            return "IPv4";
        else if(validIPv6(IP))
            return "IPv6";
        else
            return "Neither";
    }
    public static void main(String[] args){
        String d = validIPAddress("1.1.1.1.");
        System.out.println(d);
    }

}
