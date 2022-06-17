package arrayPro16;

public class PrintPrime 
{
	public static void main(String[] args) 
	{
//		int a[]= {3,4,5,6,7,8,9,102,243,34,232,342,3,323,44,54,5,654,765,876,87,87,7,87,6,654,43};
		
		for(int i=100; i<200;i++)
		{
			int count=0;
			int num=i;
			
			for(int j=2; j<=num; j++)
			{
				if(num%j==0)
				{
					count++;
				}
			}
			
			if(count==1)
			{
				System.out.print(num+" ");
			}
		}
	}
}
