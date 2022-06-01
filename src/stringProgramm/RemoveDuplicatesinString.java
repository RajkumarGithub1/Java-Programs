package stringProgramm;

public class RemoveDuplicatesinString {
	static int ab;
	public static void main(String[] args) 
	{
		String s="sravanKumar";
		String s1="";
	
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);

			int a = s1.indexOf(ch);

			if(a==-1)
			{
				s1=s1+ch;

			}
			else if(a!=-1)
			{
				ab=a;
			}
		}
		System.out.println(s.charAt(ab));

		System.out.println("````````");
		System.out.println(s1);
		
	}

}
