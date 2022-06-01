package stringProgramm;

public class swapIntoTwoHalves 
{

		public static void main (String args[])
		{

			String a = "TESTYANTRA";
			String b = "SOMAJIGUDA";
			
			int la = a.length();
			int lb = b.length();
			
			String c = a.substring(0,la/2) + b.substring(lb/2,lb);
			String d = b.substring(0,lb/2) + a.substring(la/2,la);
			
			System.out.println(c + "\n" + d);
			
			
			
		
		}
}
