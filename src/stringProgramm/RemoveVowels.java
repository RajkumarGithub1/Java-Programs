package stringProgramm;

public class RemoveVowels 
{
	public static void main(String[] args) 
	{
		String s="rajkumar";
		String r="";
		
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			
			if('a'==c ||'e'==c|| 'i'==c || 'o'==c || 'u'==c)
			{
//				int x=1;
			}
			else 
			{
			r=r+c;	
			}
			
		}
		System.out.println(r);
	
		
	}
}
