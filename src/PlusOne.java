
public class PlusOne {

	public static int[] plusOne(int[] digits) {
		if(digits.length == 0)
		{
			int[] c = new int[1];
			c[0] =1;
			return c;
		}
		int i = digits.length -1;
		while(i>=0 && digits[i]==9)
		{
			digits[i]=0;
			i--;
		}
		//�Ѿ����������еġ�9��,���ڴ����һ����9��֮ǰ�����֣�
		if(i<0)//˵����ǰ��λ���硰99��������ˡ�00����Ӧ��Ϊ��100��
		{
			int[] temp = new int[digits.length+1];
			temp[0]=1;
			int j,k;
			for( j=0;j<digits.length;j++)
			{
				temp[j+1] = digits[j];
			}
			return temp;
		}
		digits[i] += 1;
		return digits;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[]{9,9};
		int[] s = plusOne(c);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}

}
