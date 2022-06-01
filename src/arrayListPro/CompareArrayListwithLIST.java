package arrayListPro;

import java.util.ArrayList;

public class CompareArrayListwithLIST 
{
	public static void compareArrayList(ArrayList<String> l1, ArrayList<String> l2)
	{
		System.out.println("comparing l1 with l2"+"\n"+l1.containsAll(l2));
		
	}
	
	public static void main(String[] args) 
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("akarsh");
		list1.add("rajkumar");
		list1.add("sravya");
		list1.add("laxmi");
		list1.add("sai");
		list1.add("harika");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("akarsh");
		list2.add("rajkumar");
		list2.add("sravya");
		
		compareArrayList(list1, list2);
		
		
		
	}
}
