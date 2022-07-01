package stringProgramm;

public class ReverseWords 
{
	public static void main(String[] args) 
	{
		String s="we are engineers";
		
		String[] ar = s.split(" ");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
