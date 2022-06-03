package arrayProgramm;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicatesArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,9,4,3,5,4,5,6,4,7,2,9,7,9,9};
		Arrays.sort(arr);
		System.out.println("Input array"+"\n"+Arrays.toString(arr));

		int duplicates=0;
		
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]==arr[i+1])
				{
					duplicates++;
				}
			}
		
		
		int nonduplicates = arr.length-duplicates;
		
		System.out.println("Array for duplicates :"+nonduplicates);
		
		int[] arr2=new int[nonduplicates-2];
	
		int index=0;
		for(int i=0; i<arr2.length-1; i++)
		{	
			for (int j=1; j<arr2.length-1; j++)
			{  
				if(arr[i]!=arr[j])
				{
					
					arr2[index]=arr[j];
					index++;
				}
	        } 
		}
			
		System.out.println("duplicates removed"+"\n"+ Arrays.toString(arr2));
		
	}
}
