package stringProgramm;

public class StringRecursive {

	public static void main(String[] args) throws Throwable 
	{
		String s="Patience is needed";
		String rev="";
	
		char[] ar = s.toCharArray();

		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(ar[i]);
			Thread.sleep(200); 
			//Printing one after another
		}
		
	}

}