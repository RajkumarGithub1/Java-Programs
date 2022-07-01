package collectionInterfaces;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PracticePriorityQ 
{
	public static void main(String[] args) 
	{
		Queue q=new PriorityQueue<>();
		
		q.add(1);
		q.add(2);
		q.offer(10);
		q.offer(3);
		q.offer(6);
		
		System.out.println(q);
		
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.peek());
		
		for(Object o:q)
		{
			System.out.print(o);
		}
		
		System.out.println();
		Iterator i=q.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		
		
//		while(!(q.isEmpty()))
//		{
//			System.out.print(q.poll());
//		}
		
	}
}
