package collectionInterfaces;

import java.util.HashMap;
import java.util.Set;

public class PracticeHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(1, "KGF-1");
		hm.put(2, "KGF-2");
		hm.put(3, "KGF-3");
		hm.put(4, "KGF-4");
		hm.put(1, "KGF-7");
		hm.put(null, "Mission Impossible");
		hm.put(null, "Final Destination");
		
		
		System.out.println(hm.get(1));
		
		
//		System.out.println(hm);
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		System.out.println(hm.containsKey(null));
//		System.out.println(hm.containsValue("RRR"));
//		
//		Collection<String> val = hm.values();
		Set<Integer> keys = hm.keySet();
		
		for(Integer k:keys)
		{
			if(
			hm.get(k).equalsIgnoreCase("final destination")==true)
			{
				System.out.println(k);
			}
			
			
		}
//		System.out.println("Values");
//		for(Object o: val)
//		{
//			System.out.println(o);
//		}
//		System.out.println("Keys:");
//		for(Object o: keys)
//		{
//			System.out.println(o);
//		}
		
	}
}
