package stringProgramm;

public class RepetenceOfCharInString {

	public static void main(String[] args) 
	{
		String s1="ababababcdcdcd";
		String s=s1.toLowerCase();        //IN SINGLE STRING - REPETENCE
		//String s2="sravya";
		
		for(char j='a'; j<'z'; j++)
		{
			int count=0;

			for(int i=0; i<s.length(); i++)
			{
				if (j==s.charAt(i))
				{
					count++;
				} 
			}
			
			
			if(count!=0)
			{
				System.out.println(j+" is  : "+count);
			}
			
		}
		
		
	}

}
