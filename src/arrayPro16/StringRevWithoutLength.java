package arrayPro16;

public class StringRevWithoutLength 
{
	public static void main(String[] args) 
	{
		String s="abcdefg";
		
		char[] ss = s.toCharArray();
		
		String rev="";
		for(char c:ss)
		{
			rev=c+rev;
			
		}
		System.out.println(rev);
		
	}
}
