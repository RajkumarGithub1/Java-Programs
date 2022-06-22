package arrayProgramm;


public class MinAndMaxValuesArray 
{
	int min;
	public void minValuefromArray()
	{
		int [] n= {86,15,91,95,14}; 
			
		int max=n[0];
		
		for(int i=0; i<n.length-1; i++)
		{
			if(n[i]<max)
			{ 
				max=n[i];
			}
		}
		
		System.out.println(max);
		
	}
	
	public static void main(String[] args) 
	{
		MinAndMaxValuesArray val=new MinAndMaxValuesArray();
		val.minValuefromArray();
	}
}
