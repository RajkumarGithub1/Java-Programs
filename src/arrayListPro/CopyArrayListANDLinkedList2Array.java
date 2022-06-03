package arrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CopyArrayListANDLinkedList2Array 
{
	
	public void copyFromArrayList()
	{
		
		ArrayList<String> str=new ArrayList<>();
		
		str.add("akarsh");
		str.add("rajkumar");	
		str.add("sravya");
		str.add("laxmi");
		str.add("sai");
		str.add("harika");
		str.add("neeharika");
		
		
		int n = str.size();
		
		String[] arr=new String[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=str.get(i);
		}
		
		System.out.println("Output Array from From ArrayList");
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public void copyFromLinkedList()
	{
		
		LinkedList<String> str=new LinkedList<>();
		
		str.add("akarsh");
		str.add("rajkumar");
		str.add("sravya");
		str.add("laxmi");
		str.add("sai");
		str.add("harika");
		str.add("neeharika");
		
		
		int n = str.size();
		
		String[] arr=new String[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=str.get(i);
		}
		
		System.out.println("Output Array from Linked List");
		System.out.println(Arrays.toString(arr));
	}

	public void subListFromLinkedList()
	{
		LinkedList<String> str=new LinkedList<>();
		
		str.add("akarsh");
		str.add("rajkumar");
		str.add("sravya");
		str.add("laxmi");
		str.add("sai");
		str.add("harika");
		str.add("neeharika");
		
		System.out.println("Input Linked List"+"\n"+str);
		List<String> sa = str.subList(3, str.size());
		
		System.out.println("Output SubList"+"\n"+sa);
		
	}
	
	
	public static void main(String[] args) 
	{
		CopyArrayListANDLinkedList2Array array=new CopyArrayListANDLinkedList2Array();
		array.copyFromArrayList();
		array.copyFromLinkedList();
		
		array.subListFromLinkedList();
	}
}