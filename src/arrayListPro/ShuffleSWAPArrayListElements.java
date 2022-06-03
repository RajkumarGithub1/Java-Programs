package arrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShuffleSWAPArrayListElements 
{
	
	public void swapElementsArray(ArrayList<String> str)
	{
		System.out.println("Input Value for swap"+"\n"+str);
		
		Collections.swap(str, 0, str.size()-1);
		System.out.println("after swap"+"\n"+str);
				
	}
	
	
	public void shuffleElementsArray(ArrayList<String> str)
	{
		System.out.println("Input Value for shuffle"+"\n"+str);

		Collections.shuffle(str);
		System.out.println("after shuffle"+"\n"+str);
		
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
		str.add("neeharika");
		
		ArrayList<String> str2=str;

		ShuffleSWAPArrayListElements arr=new ShuffleSWAPArrayListElements();
		
		arr.shuffleElementsArray(str);
		arr.swapElementsArray(str2);
		
		
		
		
	}
}
