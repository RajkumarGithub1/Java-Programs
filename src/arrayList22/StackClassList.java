package arrayList22;

import java.util.Stack;

public class StackClassList 
{
	public static void main(String[] args) 
	{
		
		Stack st=new Stack();
		
		st.add("adsfg");
		st.add("rajjj");
		
		st.push("Test yanttraaa");
		st.push("laxxxmi");
		
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		System.out.println(st);
		System.out.println(st.peek());

		System.out.println(st.pop());
		
		System.out.println(st);
		
	}
}
