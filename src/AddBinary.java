
public class AddBinary {

	public static String addBinary(String a ,String b){
		String s = "";
		String r = "";
		int a_length = a.length();
		int b_length = b.length();
		int cha =0;
		if(a_length>b_length)
		{
			cha = a_length -b_length;
			for(int i =0;i<cha;i++)
				s= s+"0";
			b = s + b; 
		}
		if(b_length>a_length)
		{
			cha = b_length -a_length;
			for(int i =0;i<cha;i++)
				s= s+"0";
			a = s + a; 
		}
		int flag = 0;
		int jinwei_flag =0;
		char[] a_temp = a. toCharArray();
		char[] b_temp = b.toCharArray();
		char[] toReturn = new char[a_temp.length+1] ;
		for(int j=a_temp.length-1;j>=0;j--)
		{
			if(a_temp[j] == '1' && b_temp[j] == '1')
			{
				toReturn[j+1] = '0';
				if(flag==1 && toReturn[j+1]=='0')
				{
					toReturn[j+1] = '1';
					flag=0;
				}
				flag = 1;
			}
			else if((a_temp[j] == '1' && b_temp[j] == '0') ||(a_temp[j] == '0' && b_temp[j] == '1'))
			{
				toReturn[j+1] = '1';
			    if(flag==1 && toReturn[j+1]=='1')
				{
					toReturn[j+1] = '0';
					flag=1;
				}
			}
			else if (a_temp[j] == '0' && b_temp[j] == '0')
			{
				toReturn[j+1] = '0';
				if(flag==1 && toReturn[j+1]=='0')
				{
					toReturn[j+1] = '1';
					flag=0;
				}
				
			}	
			if(flag ==1 && j==0)
				jinwei_flag =1;
		}
		if(jinwei_flag==1)
		{
			toReturn[0] = '1';
			for(int k=0;k<toReturn.length;k++)
				r= r+toReturn[k];
			return r;
		}
		for(int k=1;k<toReturn.length;k++)
			r= r+toReturn[k];
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(addBinary("110","1111"));
	}

}
