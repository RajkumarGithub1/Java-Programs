package arrayPro16;

public class SecondMaxNumArray 
{
	public static void main(String[] args) 
	{
		int [] arr= {2,3,9,15,8,7,6,10,11};
		
		int max=arr[0];
		int secmax=max;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				secmax=max;
				max=arr[i];
			}
			else if(arr[i]>secmax)
			{
				secmax=arr[i];
			}
			
		}
		System.out.println(max+" "+secmax);
		
	}
}
