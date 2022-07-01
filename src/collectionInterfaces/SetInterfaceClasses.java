package collectionInterfaces;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceClasses 
{
	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet<>();
		hs.add(true);
		hs.add(1);
		hs.add("abcd");
		hs.add('c');
		hs.add(null);
		hs.add(1);
		hs.add(null);
		
//		System.out.println(hs);
		
		Iterator i=hs.iterator(); 

			
		while(i.hasNext())
				{
					System.out.println(i.next());
				}
		
		
	}
}
