package stringProgramm;

public class LengthOfString    //LENGTH OF STRING WITHOUT MAIN METHOD
{
	public static void main(String[] args) 
	{
		String s="sradggvv";
		char[] ss = s.toCharArray();
		
		int count=0;
		for( char a: ss) 
		{
			count++;
		}
		System.out.println(count);
	}
}
