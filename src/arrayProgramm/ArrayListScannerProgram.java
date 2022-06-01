package arrayProgramm;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScannerProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("``enter``");
		
		String nn = sc.next();
		ArrayList<String> al=new ArrayList<>();

		while(nn!=null)	
		{	
			if(nn.equals("exit"))
			{
				break;
			}
			else
			al.add(nn);
		}
		
		System.out.println("exit");
		for(int i=0; i<al.size()-1; i++)
		{
			System.out.println( al.get(i));
		}
	}
}
