package arrayList22;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraListExit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings");
		ArrayList<String> arr=new ArrayList<String>();
		
		boolean loop = true;
        while(loop)
        {
          String s = sc.next( );
 
            if(s.equals("exit"))
            {
              break;    
            }
            else
            {
              arr.add(s);
            }
        }
        
		System.out.println(arr);
		
		
	}
}
