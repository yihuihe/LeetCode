
public class BestTimeToBuyandSellStock {

	public static int bestTimeToBuyAndSellStock(int[] prices){
	/*  Time Limit Exceeded
		int i,j,max=0;
		for(i=0;i<price.length-1;i++)
			for(j=i+1;j<price.length;j++)
			{
				if(price[i]>price[j])
				{
					continue;
				}
				else
				{
					if(price[j]-price[i]>max)
						max = price[j]-price[i];
				}
			}
		return max;
	*/
	/*
		int max =0;
		if(prices.length == 0 || prices.length ==1)
		{
			int c = 0;
			return c;
		}
		else
		{	
			int min = prices[0];
			int min_location=0;
			
			for(int i=0;i<prices.length;i++)
			{
				if(prices[i]<min)
				{
					min = prices[i];
					min_location = i;
				}
			}
			for(int i=min_location;i<prices.length;i++)
			{
				if((prices[i]-min) > max)
					max = prices[i] - min;
			}
		}
		return max;
	*/
		
		int max = 0; 
		int index = 0;
		int result = 0;
		for(int i=1;i<prices.length;i++)
		{
			result = prices[i] - prices[index];
			if(result < 0)
				index = i;
			else if(result > max)
				max = result;	
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x =  new int[]{1};
		int c = bestTimeToBuyAndSellStock(x);
		System.out.println(c);
	}

}
