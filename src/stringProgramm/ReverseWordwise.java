package stringProgramm;

import java.util.Arrays;

public class ReverseWordwise 
{
	
	public static void main(String[] args)
	{
		String s="Engineers are future";
		
		
		String[] as = s.split(" ");
		

		for(int i=0; i<=as.length-1; i++)
		{
					
			String str=as[i];
					
			String s2="";
			for(int j=0; j<str.length(); j++)
			{
				s2=str.charAt(j)+s2;
				
			}
			System.out.print(s2+" ");
			
		}
		
		
		
		
		
		
		
	}
}
