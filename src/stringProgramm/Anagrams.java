package stringProgramm;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) 
	{
		
		String s3="RajKumar";
		String s4="RamuKraj";
		String s1=s3.replaceAll(" ", "");    //cat   --act
		String s2=s4.replaceAll(" ", "");    //tca   --act
		
		char[] ar1 = s1.toCharArray();
		
		char[] ar2 = s2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1, ar2)==true)
		{
			System.out.println("both ARE anagram");
		}
		else
		{
			System.out.println(" NOT anagram");
		}
		
		
	}

}
