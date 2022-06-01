package stringProgramm;

public class StringRev 
{
		
	// Program to Reverse a String
	public static void main(String[] args)		
	
	{
		String a="engineers";
		String rev="";
		for(int i=0; i<=a.length()-1; i++)
		{
			rev=a.charAt(i)+rev;
		}
		//System.out.println(Thread.currentThread().getId());
		System.out.println(rev);
	}
}
