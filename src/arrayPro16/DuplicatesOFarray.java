package arrayPro16;

import java.util.LinkedHashSet;

public class DuplicatesOFarray 
{
	public static void main(String[] args) 
	{
		int []a= {1,1,2,2,3,4,5,5,7,7,7,7,4,4};
		
		LinkedHashSet<Integer> lsh=new LinkedHashSet<>();
		
		for(Integer i:a) 
		{
			lsh.add(i);
		}
		
		System.out.println(lsh);
		
		for(Integer j:lsh)
		{
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==j)
				{
					count++;
				}
			}
			System.out.println(j+":   :"+count);
		}
		
	}
	
}
