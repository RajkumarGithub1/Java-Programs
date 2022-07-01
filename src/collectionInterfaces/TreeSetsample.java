package collectionInterfaces;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetsample 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet<>();
		t.add('g');
		t.add('d');
		t.add('x');
		t.add('a');
		t.add('g');
		
		System.out.print("By default Ascending Order"+"\n"+t+"\n");
		
		Iterator i= t.descendingIterator();
		System.out.print("Descending Order Iterator"+"\n");
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		
		
	}
}
