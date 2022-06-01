package stringProgramm;

public class RepetenceOfCharInString {

	public static void main(String[] args) 
	{
		String s1="rajkumar";
		String s=s1.toLowerCase();        //IN SINGLE STRING - REPETENCE
		//String s2="sravya";
		
		for(int j=0; j<s.length(); j++)
		{
			int count=0;

			for(int i=0; i<s.length(); i++)
			{
				if (s.charAt(j)==s.charAt(i))
				{
					count++;
				} 
			}
			
			if(count!=0)
			{
				System.out.println(s.charAt(j)+" is   "+count);
			}
			
		}
		
		
	}

}
