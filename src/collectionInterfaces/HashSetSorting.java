package collectionInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetSorting 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<>();
		hs.add(31);
		hs.add(14);
		hs.add(59);
		hs.add(49);
		hs.add(28);
		
		System.out.println(hs);
		
		ArrayList<Integer> al=new ArrayList<>(hs);
		
		Collections.sort(al);
		System.out.println(al);
		
	}
}
