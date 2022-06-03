package arrayListPro;

import java.util.ArrayList;
import java.util.Collections;

public class NewArrayListmaxNo
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> iArr=new ArrayList<>();
		
		iArr.add(123);
		iArr.add(124);
		iArr.add(125);
		iArr.add(126);
		iArr.add(120);
		iArr.add(121);
		
		
		Integer ifj = Collections.max(iArr);
		System.out.println(ifj);
	
		
	
		
	}
}
