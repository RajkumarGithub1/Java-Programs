package arrayListPro;

import java.util.Arrays;

public class RemoveEVENDuplicates 
{
	public static void main(String[] args) 
	{
		int[] n= {1,2,3,5,3,2,4,6,6,6};
		int count=0;
		System.out.println("Input array is"+"\n"+Arrays.toString(n));
		
		for(int i=0; i<n.length-1; i++)
		{
			if(n[i]%2!=0)
			{
				count++;
			}
		}
		
		int[] n1=new int[count];
		int index=0;
		for(int i=0; i<n.length-1; i++)
		{
			if(n[i]%2!=0)
			{
				n1[index]=n[i];
				index++;
			}
		}
		
		System.out.println("Output Array"+"\n"+Arrays.toString(n1));
	}
}
