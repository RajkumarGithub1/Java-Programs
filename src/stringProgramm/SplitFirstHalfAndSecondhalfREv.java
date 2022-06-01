package stringProgramm;

public class SplitFirstHalfAndSecondhalfREv 
{

	public static void main(String[] args) 
	{
		String r="sravan kumar";
		int lr=r.length();
		
		System.out.println(r.indexOf('a'));
		
		
		String rev1 = r.substring(0, lr/2);
		String rev="";
		String rev2=r.substring(lr/2, lr);
		String rev3="";
		
		for(int i=0; i<=rev1.length()-1; i++)
		{
			rev=rev1.charAt(i)+rev;
			rev3=rev2.charAt(i)+rev3;
		}
		System.out.println(rev+"\n"+rev3);		
	}

}
