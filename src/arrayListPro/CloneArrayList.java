package arrayListPro;

import java.util.ArrayList;
import java.util.Collections;

public class CloneArrayList 
{
	public static void cloneArray(ArrayList<String> str)
	{
		
		ArrayList<String> r= (ArrayList<String>) str.clone();
		
		//FOR PRINTING
		System.out.println("cloneArray");
		for(String s:r )
		{
			System.out.print(s+" ");
		}
	}
	
	public static void copyArray(ArrayList<String> str)
	{
		ArrayList<String> r=new ArrayList<>();
		
		for(String s:r)
		{
			r.add(s);
		}
		
		//FOR PRINTING
		System.out.println("copyArray");
		for(String s:r )
		{
			System.out.print(s+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<String> str=new ArrayList<>();
		str.add("akarsh");
		str.add("rajkumar");
		str.add("sravya");
		str.add("laxmi");
		str.add("sai");
		str.add("harika");
		
		//CALLING METHOD
		cloneArray(str);
		System.out.println();
		copyArray(str);
	}
}
