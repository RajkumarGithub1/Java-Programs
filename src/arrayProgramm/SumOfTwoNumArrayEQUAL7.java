package arrayProgramm;


public class SumOfTwoNumArrayEQUAL7 
{
	public static void main(String[] args) 
	{
		
		int arr[]= {2,4,5,3,6,7,0,1};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==7)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
