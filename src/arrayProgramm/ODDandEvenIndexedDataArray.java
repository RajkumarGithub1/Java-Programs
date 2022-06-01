package arrayProgramm;

public class ODDandEvenIndexedDataArray 
{
	public void oddIndexesOfArray()
	{
		char c[]= {'a','k','a','r','s','h' };
		
		for(int i=0; i<c.length; i++)
		{
			if((i%2)==0) 
			{
				System.out.print(c[i]+" ");
			}
		}
	}
	
	public void evenIndexesOfArray()
	{
		char c[]= {'a','k','a','r','s','h' };
		
		for(int i=0; i<c.length; i++)
		{
			if((i%2)!=0)
			{
				System.out.print(c[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ODDandEvenIndexedDataArray arr=new ODDandEvenIndexedDataArray();
		arr.oddIndexesOfArray();
		arr.evenIndexesOfArray();
	}
}
