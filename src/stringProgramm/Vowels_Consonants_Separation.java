package stringProgramm;

public class Vowels_Consonants_Separation 
{
	public static void vowels_Consonants_Separate_withoutReplaceALL(String ss)
	{
		String vowels="";
		String conso="";
//		char[] s=ss.toCharArray();
		String s=ss.toLowerCase();
		
		for(int i=0; i<s.length(); i++)
		{
			char c = ss.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowels=vowels+c;
				
			}
			else
			{
				conso=conso+c;
			}
		}
		
		System.out.println("vowels in String are :"+vowels);
		System.out.println("consonants in given string :"+conso);
		
	}
	
	public static void vowels_Consonants_Separate_withoutReplace(String ss)
	{
		System.out.println("vowels :"+ss.replaceAll("[aeiou]", ""));
		
		System.out.println("consonants :"+ss.replaceAll("[^aeiou]", ""));
	}
	
	public static void main(String[] args) 
	{
		String a="Sravya";
		vowels_Consonants_Separate_withoutReplace(a);
		
	}
}
