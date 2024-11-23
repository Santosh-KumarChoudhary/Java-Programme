
public class Vararg {
	
	public static void main(String[] args) {
		System.out.println(sum(10,12,7,8,9,10));
		
		details("San","Xan","RAn");
		
	}

	
	public static int sum(int a, int b,int ...c)
	
	{
		int sum =0;
		
		sum = a+b;
		
		for(int i:c)
			
		{
			sum=sum+i;
		}
		
		return sum;
	}
	
	public static void details(String ... name)
	{
		//String det="";
	
	{
		
		for(String deti:name)
		System.out.println("Deatils are "+deti);
	}
	
}}
