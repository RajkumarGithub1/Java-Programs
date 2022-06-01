package stringProgramm;

public class CommonCharIn2Strings 
{

	public static void main(String[] args) 
	{
		String s1="rajkumar";
		String s=s1.toLowerCase();
		String s2="sravya";
		String r=s2.toLowerCase();
		
		
		for(int j=0; j<s.length(); j++)
		{
			int count=0;

			for(int i=0; i<r.length(); i++)
			{
				if (s.charAt(j)==r.charAt(i))
				{
					count++;
				} 
			}
			
			if(count!=0) 
			{
				System.out.println("Common char :"+s.charAt(j)+" is   "+count);
			}
			
		}
	}
}