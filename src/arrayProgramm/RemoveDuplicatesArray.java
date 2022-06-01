package arrayProgramm;

import java.util.Arrays;

public class RemoveDuplicatesArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,9,4,3,5,4,5,6,4,7,2,9,7,9,9};
		int n = arr.length;

        int[] temp = new int[n];  

		int j=0;
		for(int i=0; i<n-1; i++)
		{
		
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		
		}
		
		temp[j++] = arr[n-1];  
		for (int i=0; i<j; i++){  
            arr[i] = temp[i];
        } 
		
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		System.out.println( Arrays.toString(arr));
		
	}
}
