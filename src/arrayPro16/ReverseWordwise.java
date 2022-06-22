package arrayPro16;

public class ReverseWordwise 
{
	public static void main(String[] args) 
	{
//		String s="Hyderabad Test Yantra";
//		String[] ss = s.split(" ");
//		
//		String rev="";
//		for(String sss:ss)
//		{
//			rev=sss+" "+rev;
//		}
//		
//		System.out.println(rev);
		

		String s="Hyderabad Test Yantra";
		String[] ss = s.split(" ");
		
		for(String sss:ss)
		{
			char[] c = sss.toCharArray();
			String temp="";
			
			for(char cc:c)
			{
				temp=cc+temp;
			}
			System.out.print(temp+" ");
		}
		
		
	}
}
