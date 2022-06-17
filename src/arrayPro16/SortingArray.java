package arrayPro16;

import java.util.Arrays;

public class SortingArray 
{
	public static void main(String[] args) 
	{
		
		int ar[] = {0,1,0,0,1,1,0,1};
		
		int temp;
		int n = ar.length;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
