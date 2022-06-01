package stringProgramm;

public class CommonCharCountfrmStrings 
{

	public static void main(String[] args) 
	{
		String s1="project";
		String s2="contacts";
		String s3=s1.toUpperCase();
		String s4=s2.toUpperCase();
		char ch[]=s3.toCharArray();
		char ch1[]=s4.toCharArray();
		
		for(char h='A';h<='Z';h++)
		{
			int count = 0;
			for(int i=0;i<ch.length;i++)
			{
				for(int j=0;j<ch1.length;j++)
				{
					if(ch[i]==ch1[j])
			
						count++;
					}
			}
			
			if(count>0)
				System.out.println("Characters matched:"+count);
		}
	}
}