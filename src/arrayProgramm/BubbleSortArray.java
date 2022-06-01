package arrayProgramm;

import java.util.Arrays;

public class BubbleSortArray 
{
	public static void main(String[] args) 
	{
		int ar[] = {1,9,10,34,65,3,5,35,32,4 };
		
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
		
		//FOR PRINTING 
//		for(int i=0; i<n; i++)
//		{
//			System.out.print( ar[i]+" ");
//		}
		
		System.out.println("array is :"+ Arrays.toString(ar));
	}
}