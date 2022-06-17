package arrayPro16;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class PrintingCharINString 
{
	public static void main(String[] args) 
	{
		String s="dddaabccbbaabccd";
		char[] ss = s.toCharArray();
		Arrays.sort(ss);
		LinkedHashSet<Character> ls=new LinkedHashSet<>();
		
		for(char s2:ss)
		{
			ls.add(s2);
		}
		System.out.println(ls);
		
		for(Character ch:ls)
		{
			for(int j=0; j<ss.length; j++)
			{
				if(ch.equals(ss[j]))
				{
					System.out.print(ch);
				}
			}
			System.out.println();
		}
		
	}
}
