package collectionInterfaces;

import java.util.LinkedList;
import java.util.Queue;

public class Practice11 
{
	public static void main(String[] args) 
	{
		Queue q=new LinkedList<>();
		
		q.add("raj");
		q.add("kumar");
		q.add("raaaj");
		q.add("kumaaar");
		System.out.println("element :"+q.element());
		System.out.println("peek :"+q.peek());
		System.out.println("poll :"+q.poll());
		System.out.println("offer :"+q.offer("dsfds"));
		System.out.println(q);
		
	}
}
