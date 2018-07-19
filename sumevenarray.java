
public class sumevenarray {

	public static void main(String[] args)
	{
		int arr[]= {13,20,31,40,50};
		int even=0;//int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even+=arr[i];
				//temp=even;
				//System.out.println("evensum"+even);
				
			}
		}
		System.out.println("evensum"+even);	
				
		}
}
