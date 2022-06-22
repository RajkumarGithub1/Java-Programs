package arrayList22;

import java.util.ArrayList;

public class ArrayListOper 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		
		al.add(3);
		al.add(5);
		System.out.println(al);
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(8);
		a.add(7);
		a.add(6);
		a.add(4);
		System.out.println(a);
		System.out.println(a.retainAll(al));
		System.out.println(a);
		System.out.println(al);
		System.out.println(a);
	}
}
