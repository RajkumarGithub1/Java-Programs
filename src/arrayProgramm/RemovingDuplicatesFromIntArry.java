package arrayProgramm;

import java.util.Arrays;

public class RemovingDuplicatesFromIntArry 
{
	public static void main(String[] args) 
	{

        int []arr={2, 2,1, 1,3,3,4,4,4};
        Arrays.sort(arr);
		System.out.println("Input Array :"+"\n"+ Arrays.toString(arr));

        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                     count++;                
                }            
            }
        }
        
        
        System.out.println(count);
        
        System.out.println(arr.length);
       
        int[] arr2=new int[arr.length-count];
        
        int index=0;
      
		for(int i=0; i<arr.length-1; i++)         
		{	  
			int xyz=0;
			for (int j=i+1; j<arr.length-1; j++)    
			{  										
				if(arr[i]==arr[j])             
				{									
					xyz++;
				}
			} 
			if(xyz==0)
			{
				arr2[index]=arr[i];
				index++;

			}
		}
		
		System.out.println("New Array After Removing Duplicates:"+"\n"+ Arrays.toString(arr2));
   }
	
}
