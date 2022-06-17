package arrayPro16;

public class AddingArray 
{
	
	public static void main(String[] args) 
	{
	
		int a[]= {5,4,3,2,1};
		int b[]= {4,3,2,1};
		
		int length=a.length;
		
		if(a.length>b.length)
		{
			length=b.length;
		}
		
		for(int i=0; i<length; i++)
		{
				System.out.println(a[i]+b[i]+" ");
		}
		
		if(a.length>b.length) 
		{
			System.out.println(a[a.length-1]);
		}
		else
		{
			System.out.println(b[b.length-1]);
		}
	}
	
}