package arrayPro16;

public class AddingNumINString
{
	public static void AddingWithReplace()
	{
		
		String s="a11b22c33";
		String as = s.replaceAll("[^0-9]", "a");
		
		String[] ar = as.split("a");
		
		int sum=0;
		for(int j=1; j<ar.length;j++)
		{
			String aa = ar[j];
			int i=new Integer(aa);
			sum=sum+i;
		}
		
		System.out.println(sum);
		
	}
	
	public static void AddingWithoutReplace()
	{
		String s="a11b22c33";
		int num=0;
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int val = s.charAt(i)-48;
				num=num*10+val;
				
			}
			else
			{
				sum=sum+num;
				num=0;
			}
			
		}
		System.out.println(num+sum);
	}
	
	public static void main(String[] args) 
	{
		AddingWithReplace();
		AddingWithoutReplace();
	}
	
}
