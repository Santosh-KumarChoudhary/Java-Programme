package randomproglearning;

public class MaxOfAnArray {
	
	public static void main(String[] args) {
		
		int arr []= {2,12,3,16,78};
		
		System.out.println(max(arr));
		
	}

	
	public static int max(int ar[])
	
	{
		
		int maxvalue=ar[0];

		for(int i=1;i<ar.length;i++)
			
		{
			
			if(ar[i]>maxvalue)
				
			{
				maxvalue=ar[i];
			}
		}
		
		return maxvalue;
	}
}
