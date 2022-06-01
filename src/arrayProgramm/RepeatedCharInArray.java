package arrayProgramm;

import java.util.Arrays;

public class RepeatedCharInArray 
{
	public void repeatedCHAR() 
	{
	
		char [] c= {'c','a','a', 'c','a', 'c','c'};
		Arrays.sort(c);
		
		for(int i=0; i<c.length-1; i++)
		{
			int count=0;

			for(int j=1; j<c.length; j++)
			{
				
				if(c[i]==c[j])
				{
					count++;
					System.out.print(c[i]+" ");
				}
			}
			System.out.println(c[i]+" "+count);
		}
	}
	
	
	
	public static void main(String []args)
	{
		RepeatedCharInArray as=new RepeatedCharInArray();
		as.repeatedCHAR();
	}
}
