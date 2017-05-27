import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hyh on 2017/5/27.
 */
public class LastCharacter {
    public static char findResult(String str){
        int[] tag = new int[256];
        for(int i=0;i<256;i++)
            tag[i] = 0;
        char result = 0;
        for(int j=0;j<str.length();j++){
            tag[str.charAt(j)]++;
        }
        for(int k=0;k<str.length();k++){
            if(tag[str.charAt(k)] == 1)
            {
                result = str.charAt(k);
                break;
            }
        }
        return result;

    }
    public  static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try{
            number = Integer.parseInt(bufferedReader.readLine());
            for(int i=0;i<number;i++){
                String temp = bufferedReader.readLine();
                char result = findResult(temp);
                System.out.println(result);

            }
        }catch (IOException e1){
            e1.printStackTrace();
        }


    }
}
