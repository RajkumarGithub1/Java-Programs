package stringProgramm;

public class AlphaNumericSeparation {
	
	public static void main(String[] args) 
	{
		
		String str="rajkumar123@@.!";
		String s="";
		String number="";
		String alpha="";
		int count1=0;
		int count2=0;
		int spl=0;
		
		// length of 
		System.out.println(str.lastIndexOf(""));
		
		
		for(int i=0; i<str.length(); i++)
		{
			char c=str.charAt(i);
			
			if((c>='a'&& c<='z') || (c>='A'&& c<='Z'))
			{
				s=s+str.charAt(i);
				count1++;
			} 
			
			else if((c>='0') && (c<='9'))
			{
				number=number+str.charAt(i);
				count2++;
			}
			else
			{
				alpha=alpha+c;
				spl++;
			}
		}
		System.out.println("String is :"+s);
		System.out.println("count chars :"+count1);
		System.out.println("Num are :"+number);
		System.out.println("count Nos :"+count2);
		System.out.println("alpha num :"+spl);
		System.out.println("alpha chars :"+alpha);
		
	

//		ALTERNATE 
//		
//		String s="Rajkumar123@@.!";
//		System.out.println(s.replaceAll("[^0-9]", ""));  //for numbers
//		System.out.println(s.replaceAll("[^a-zA-Z]", ""));  //for String data
//		System.out.println(s.replaceAll("[0-9a-zA-Z]", "")); //for alpha numeric

		
		
		
		
		
		
	
	
	
	}
}
