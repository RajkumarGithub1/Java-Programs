package arrayPro16;

import java.util.Arrays;

public class SortWithNewLoop 
{
	public static void main(String[] args) 
	{
		int a[] = {0,1,0,0,1,1,0,1};
		int b[]=new int[a.length];
		
		int n=a.length-1;
		int m=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>0)
			{
				b[n]=a[i];
				n--;
			}
			else
			{
				b[m]=a[i];
				m++;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}
