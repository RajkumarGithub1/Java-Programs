package arrayPro16;

public class SwappingStringsINArray 
{
	public static void main(String[] args) 
	{
		String s="Welcome to TestYantra Hyderabad";
		
		String[] ss = s.split(" ");
		
		String s1="";
		
		s1=ss[0];
		ss[0]=ss[ss.length-1];
		ss[ss.length-1]=s1;
		
		for(String aa:ss)
		{
			System.out.print(aa+" ");
		}
		
	}
}
