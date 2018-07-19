
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,26,40,50};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Actual order"+arr[i]);
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println("Reverse order"+arr[i]);
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==26)
			{
				temp=1;
				break;
			}
			if(temp==1)
			{
			
				System.out.println("data found");
			  
			}
			 else
			    {
			    	System.out.println("no data found");
			    }
		}

	}
	}


