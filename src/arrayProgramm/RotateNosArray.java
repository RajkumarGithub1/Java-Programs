package arrayProgramm;

import java.util.Arrays;

public class RotateNosArray 
{
	public static void rotateFirstNumber(int []a)
	{   
	
			
		int first=a[0];
		for(int j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
			
		}
		
		a[a.length-1]=first;
		System.out.println();
		System.out.println("rotateFirstNumber Output Array:");
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotateLastNumber(int []a)
	{
		int l=a.length;
		int last=a[l-1];
		for(int j=a.length-1; j>0; j--)
		{
			a[j]=a[j-1];
			
		}
		
		a[0]=last;
		System.out.println();
		System.out.println("rotateLastNumber Output Array:");
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotateBothNumbers(int []a)
	{
		int l=a.length;
		int last=a[l-1];
		int first=a[0];
				
		a[0]=last;
		a[a.length-1]=first;
		System.out.println();
		System.out.println("rotateBothNumbers Output Array:");
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) 
	{
		int a[] = { 1,2,3,4,5,6,7,8 };
		int b[] = { 1,2,3,4,5,6,7,8 };
		int c[] = { 1,2,3,4,5,6,7,8 };
		
		System.out.println("Input Array: ");
		System.out.println( Arrays.toString(a));
		rotateFirstNumber(a);
		rotateLastNumber(b);
		rotateBothNumbers(c);
	
	}
	

}
