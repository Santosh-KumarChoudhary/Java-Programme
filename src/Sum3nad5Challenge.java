
public class Sum3nad5Challenge {
	public static void main(String[] args) {
		
		int sum=0;
		int count =0;
		for(int i=1;i<=1000;i++)
			
		{
			if(i%3==0 && i%5==0)
				
			{
				System.out.println("divisible by 3 and 5 is : "+i);
				count++;
				sum=sum+i;
				
				
				if(count==5)
					
				{
					break;
				}
			}
			
			
		}
		System.out.println("sum "+sum);
	}

}
